package com.marcohern.barez.service;

import com.marcohern.barez.config.JwtService;
import com.marcohern.barez.domain.entity.User;
import com.marcohern.barez.domain.enums.Role;
import com.marcohern.barez.dto.request.LoginRequest;
import com.marcohern.barez.dto.response.AuthResponse;
import com.marcohern.barez.exception.ApiException;
import com.marcohern.barez.repository.UserRepository;
import com.marcohern.barez.service.impl.AuthServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AuthServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Mock
    private JwtService jwtService;

    @InjectMocks
    private AuthServiceImpl authService;

    private User manager;

    @BeforeEach
    void setUp() {
        manager = new User("Marco", "marco@bar.com", "hashed_pw", Role.MANAGER);
        setId(manager, 1L);
    }

    private void setId(User u, Long id) {
        try {
            var field = User.class.getDeclaredField("id");
            field.setAccessible(true);
            field.set(u, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void login_returnsToken_whenCredentialsAreValid() {
        LoginRequest req = new LoginRequest("marco@bar.com", "plaintext");
        when(userRepository.findByEmail("marco@bar.com")).thenReturn(Optional.of(manager));
        when(passwordEncoder.matches("plaintext", "hashed_pw")).thenReturn(true);
        when(jwtService.generateToken(manager)).thenReturn("jwt.token.here");

        AuthResponse response = authService.login(req);

        assertThat(response.token()).isEqualTo("jwt.token.here");
        assertThat(response.userId()).isEqualTo(1L);
        assertThat(response.name()).isEqualTo("Marco");
        assertThat(response.role()).isEqualTo(Role.MANAGER);
    }

    @Test
    void login_throwsBadRequest_whenUserNotFound() {
        LoginRequest req = new LoginRequest("unknown@bar.com", "pw");
        when(userRepository.findByEmail("unknown@bar.com")).thenReturn(Optional.empty());

        assertThatThrownBy(() -> authService.login(req))
                .isInstanceOf(ApiException.class)
                .hasMessage("Invalid credentials")
                .satisfies(ex -> assertThat(((ApiException) ex).getStatus()).isEqualTo(HttpStatus.BAD_REQUEST));
    }

    @Test
    void login_throwsForbidden_whenAccountIsDisabled() {
        manager.setActive(false);
        LoginRequest req = new LoginRequest("marco@bar.com", "plaintext");
        when(userRepository.findByEmail("marco@bar.com")).thenReturn(Optional.of(manager));

        assertThatThrownBy(() -> authService.login(req))
                .isInstanceOf(ApiException.class)
                .hasMessage("Account is disabled")
                .satisfies(ex -> assertThat(((ApiException) ex).getStatus()).isEqualTo(HttpStatus.FORBIDDEN));
    }

    @Test
    void login_throwsBadRequest_whenPasswordDoesNotMatch() {
        LoginRequest req = new LoginRequest("marco@bar.com", "wrong_pw");
        when(userRepository.findByEmail("marco@bar.com")).thenReturn(Optional.of(manager));
        when(passwordEncoder.matches("wrong_pw", "hashed_pw")).thenReturn(false);

        assertThatThrownBy(() -> authService.login(req))
                .isInstanceOf(ApiException.class)
                .hasMessage("Invalid credentials")
                .satisfies(ex -> assertThat(((ApiException) ex).getStatus()).isEqualTo(HttpStatus.BAD_REQUEST));
    }

    @Test
    void login_doesNotCallJwt_whenPasswordFails() {
        LoginRequest req = new LoginRequest("marco@bar.com", "wrong");
        when(userRepository.findByEmail("marco@bar.com")).thenReturn(Optional.of(manager));
        when(passwordEncoder.matches("wrong", "hashed_pw")).thenReturn(false);

        assertThatThrownBy(() -> authService.login(req)).isInstanceOf(ApiException.class);

        verifyNoInteractions(jwtService);
    }
}
