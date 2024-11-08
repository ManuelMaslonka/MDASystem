package com.maslonka.mda.system.springboot.configuration;

import com.maslonka.mda.system.account.domainapi.AccountApi;
import com.maslonka.mda.system.customer.accountapi.AccountServiceApi;
import com.maslonka.mda.system.customer.accountapi.CustomerAccountApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerApiConfiguration {

    @Bean
    public CustomerAccountApi accountServiceApi(AccountApi accountApi) {
        return new AccountServiceApi(accountApi);
    }
}
