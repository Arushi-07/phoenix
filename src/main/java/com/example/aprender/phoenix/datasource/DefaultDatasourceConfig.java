package com.example.aprender.phoenix.datasource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DefaultDatasourceConfig {
    @Bean
    public DataSource datasource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://database-1.c3m5qfylfe03.ap-south-1.rds.amazonaws.com:5432/phoenix")
                .username("postgres")
                .password("postgres")
                .build();
    }
}
