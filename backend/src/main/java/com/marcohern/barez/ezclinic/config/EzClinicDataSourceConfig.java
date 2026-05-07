package com.marcohern.barez.ezclinic.config;

import com.zaxxer.hikari.HikariDataSource;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.marcohern.barez.ezclinic.repository",
        entityManagerFactoryRef = "ezclinicEntityManagerFactory",
        transactionManagerRef = "ezclinicTransactionManager"
)
public class EzClinicDataSourceConfig {

    @Value("${ezclinic.datasource.url}")
    private String url;

    @Value("${ezclinic.datasource.username}")
    private String username;

    @Value("${ezclinic.datasource.password}")
    private String password;

    @Value("${ezclinic.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${ezclinic.jpa.hibernate.dialect}")
    private String dialect;

    @Value("${ezclinic.jpa.hibernate.ddl-auto:none}")
    private String ddlAuto;

    @Value("${ezclinic.jpa.show-sql:false}")
    private String showSql;

    @Bean(name = "ezclinicDataSource")
    public DataSource ezclinicDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setDriverClassName(driverClassName);
        ds.setReadOnly(true);
        return ds;
    }

    @Bean(name = "ezclinicEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean ezclinicEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("ezclinicDataSource") DataSource dataSource) {
        Map<String, Object> props = new HashMap<>();
        props.put("hibernate.dialect", dialect);
        props.put("hibernate.hbm2ddl.auto", ddlAuto);
        props.put("hibernate.show_sql", showSql);
        props.put("hibernate.connection.readOnly", "true");
        props.put("hibernate.default_read_only", "true");
        return builder
                .dataSource(dataSource)
                .packages("com.marcohern.barez.ezclinic.entity")
                .persistenceUnit("ezclinic")
                .properties(props)
                .build();
    }

    @Bean(name = "ezclinicTransactionManager")
    public PlatformTransactionManager ezclinicTransactionManager(
            @Qualifier("ezclinicEntityManagerFactory") EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}
