package com.maslonka.mda.system.springboot.monitoring.configuration;

import com.maslonka.mda.system.account.domainapi.account.AccountApi;
import com.maslonka.mda.system.customer.domain.DomainCustomerFacade;
import com.maslonka.mda.system.customer.domain.accountapi.AccountServiceApi;
import com.maslonka.mda.system.customer.domain.accountapi.OutboundAccountServiceApi;
import com.maslonka.mda.system.customer.domain.customer.CustomerFacade;
import com.maslonka.mda.system.customer.domain.customer.CustomerFactory;
import com.maslonka.mda.system.customer.domain.customer.CustomerRepository;
import com.maslonka.mda.system.customer.domain.customer.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerApiConfiguration {

    @Bean
    public AccountServiceApi accountServiceApi(AccountApi accountApi) {
        return new OutboundAccountServiceApi(accountApi);
    }

    @Bean
    public DomainCustomerFacade domainCustomerFacade(CustomerService customerService, AccountServiceApi accountServiceApi) {
        return new DomainCustomerFacade(customerService, accountServiceApi);
    }

    @Bean
    public CustomerService customerService(CustomerRepository customerRepository, CustomerFactory customerFactory) {
        return new CustomerFacade(customerRepository, customerFactory);
    }

    @Bean
    public CustomerFactory customerFactory(CustomerRepository customerRepository) {
        return new CustomerFactory(customerRepository);
    }
}
