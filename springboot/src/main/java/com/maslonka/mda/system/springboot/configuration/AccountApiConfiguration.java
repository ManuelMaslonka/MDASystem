package com.maslonka.mda.system.springboot.configuration;

import com.maslonka.mda.system.account.domainapi.AccountApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.api.AccountServiceApi;

@Configuration
public class AccountApiConfiguration {

    @Bean
    public AccountApi accountApi(AccountService accountService) {
        return new AccountServiceApi(accountService);
    }
}
