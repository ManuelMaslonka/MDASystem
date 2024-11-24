package com.maslonka.mda.system.springboot.configuration;

import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.transaction.TransactionFactory;
import com.maslonka.mda.system.account.domain.transaction.TransactionRepository;
import com.maslonka.mda.system.account.domain.transaction.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TransactionConfiguration {

    @Bean
    public TransactionService transactionService(
            TransactionRepository transactionRepository,
            TransactionFactory transactionFactory
    ) {
        return new TransactionService(
                transactionRepository,
                transactionFactory
        );
    }

    @Bean
    public TransactionFactory transactionFactory(AccountService accountService) {
        return new TransactionFactory(accountService);
    }
}
