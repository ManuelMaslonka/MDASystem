package com.maslonka.mda.system.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.maslonka.mda.system.account.domain.account.AccountFacade;
import com.maslonka.mda.system.account.domain.account.AccountRepository;

@Configuration
public class AccountConfiguration {

    @Bean
    public AccountFacade accountService(AccountRepository accountRepository) {
        return new AccountFacade(accountRepository);
    }
}
