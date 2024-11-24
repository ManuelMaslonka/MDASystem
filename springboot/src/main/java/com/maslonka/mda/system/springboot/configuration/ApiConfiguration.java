package com.maslonka.mda.system.springboot.configuration;

import com.maslonka.mda.system.account.domain.DomainFacade;
import com.maslonka.mda.system.account.domain.api.TransferServiceApi;
import com.maslonka.mda.system.account.domainapi.account.AccountApi;
import com.maslonka.mda.system.account.domainapi.transaction.TransactionApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.api.AccountServiceApi;

@Configuration
public class ApiConfiguration {

    @Bean
    public AccountApi accountApi(AccountService accountService) {
        return new AccountServiceApi(accountService);
    }

    @Bean
    public TransactionApi transactionApi(DomainFacade domainFacade) {
        return new TransferServiceApi(domainFacade);
    }
}
