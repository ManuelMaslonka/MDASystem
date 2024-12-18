package com.maslonka.mda.system.springboot.monitoring.configuration;

import com.maslonka.mda.system.account.domain.DomainAccountFacade;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.transaction.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfiguration {

    @Bean
    public DomainAccountFacade domainAccountFacade(AccountService accountService, TransactionService transactionService) {
        return new DomainAccountFacade(accountService, transactionService);
    }
}
