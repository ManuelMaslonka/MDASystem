package com.maslonka.mda.system.springboot.monitoring.configuration;

import com.maslonka.mda.system.account.domain.account.AccountFacade;
import com.maslonka.mda.system.account.domain.account.AccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfiguration {

    @Bean
    public AccountFacade accountService(AccountRepository accountRepository) {
        return new AccountFacade(accountRepository);
    }
}
