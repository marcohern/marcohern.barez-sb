package com.marcohern.barez.ezclinic;

import com.marcohern.barez.ezclinic.repository.PacientesRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Smoke test for the EZCLINICME secondary datasource.
 *
 * Disabled by default — hits the live external SQL Server. Run with:
 *   EZCLINIC_IT=true mvn -f backend/pom.xml test
 */
@SpringBootTest
@EnabledIfEnvironmentVariable(named = "EZCLINIC_IT", matches = "true")
class EzClinicDataSourceSmokeTest {

    @Autowired
    private PacientesRepository pacientesRepository;

    @Test
    void datasource_isWired_andCountIsNonNegative() {
        long count = pacientesRepository.count();
        assertThat(count).isGreaterThanOrEqualTo(0L);
    }
}
