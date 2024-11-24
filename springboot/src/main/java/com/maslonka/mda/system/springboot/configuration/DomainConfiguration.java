package com.maslonka.mda.system.springboot.configuration;

import com.maslonka.mda.system.account.domain.DomainFacade;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.transaction.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfiguration {

    @Bean
    public DomainFacade domainFacade(AccountService accountService, TransactionService transactionService) {
        return new DomainFacade(accountService, transactionService);
    }
}
