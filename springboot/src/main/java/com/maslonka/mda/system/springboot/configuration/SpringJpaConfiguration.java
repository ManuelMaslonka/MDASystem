package com.maslonka.mda.system.springboot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.maslonka.mda.system")
public class SpringJpaConfiguration {
}
