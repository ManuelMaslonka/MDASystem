package com.maslonka.mda.system.springboot.monitoring.configuration;

import com.maslonka.mda.system.account.domain.DomainAccountFacade;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.api.AccountServiceApi;
import com.maslonka.mda.system.account.domain.api.TransferServiceApi;
import com.maslonka.mda.system.account.domainapi.account.AccountApi;
import com.maslonka.mda.system.account.domainapi.transaction.TransactionApi;
import com.maslonka.mda.system.customer.domain.DomainCustomerFacade;
import com.maslonka.mda.system.customer.domain.accountapi.CustomerAccountApi;
import com.maslonka.mda.system.customer.domain.accountapi.OutboundAccountApi;
import com.maslonka.mda.system.customer.domain.api.CustomerServiceApi;
import com.maslonka.mda.system.customer.domainapi.CustomerApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfiguration {

    @Bean
    public AccountApi accountApi(AccountService accountService) {
        return new AccountServiceApi(accountService);
    }

    @Bean
    public TransactionApi transactionApi(DomainAccountFacade domainAccountFacade) {
        return new TransferServiceApi(domainAccountFacade);
    }

    @Bean
    public CustomerApi customerApi(DomainCustomerFacade domainCustomerFacade) {
        return new CustomerServiceApi(domainCustomerFacade);
    }

    @Bean
    public CustomerAccountApi customerAccountApi(AccountApi accountApi) {
        return new OutboundAccountApi(accountApi);
    }
}