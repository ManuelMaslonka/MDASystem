package com.maslonka.mda.system.springboot.monitoring.configuration;

import com.maslonka.mda.system.account.domainapi.account.AccountApi;
import com.maslonka.mda.system.customer.domain.DomainCustomerFacade;
import com.maslonka.mda.system.customer.domain.accountapi.CustomerAccountApi;
import com.maslonka.mda.system.customer.domain.accountapi.OutboundAccountApi;
import com.maslonka.mda.system.customer.domain.customer.CustomerFacade;
import com.maslonka.mda.system.customer.domain.customer.CustomerFactory;
import com.maslonka.mda.system.customer.domain.customer.CustomerRepository;
import com.maslonka.mda.system.customer.domain.customer.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerApiConfiguration {

    @Bean
    public CustomerAccountApi accountServiceApi(AccountApi accountApi) {
        return new OutboundAccountApi(accountApi);
    }

    @Bean
    public DomainCustomerFacade domainCustomerFacade(CustomerService customerService, CustomerAccountApi customerAccountApi) {
        return new DomainCustomerFacade(customerService, customerAccountApi);
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
