package com.maslonka.mda.system.springboot.configuration;

import com.maslonka.mda.system.account.accountapi.AccountApi;
import com.maslonka.mda.system.account.accountapi.AccountServiceApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sk.maslonka.mda.system.account.domain.account.AccountFacade;

@Configuration
public class AccountApiConfiguration {

    @Bean
    public AccountApi accountApi(AccountFacade accountFacade) {
        return new AccountServiceApi(accountFacade);
    }
}
