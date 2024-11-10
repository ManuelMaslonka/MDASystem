package com.maslonka.mda.system.customer.controller;

import com.maslonka.mda.system.customer.accountapi.CustomerAccountApi;
import com.maslonka.mda.system.customer.accountapi.dto.CustomerAccountDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    private final CustomerAccountApi customerService;

    public CustomerRestController(CustomerAccountApi customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/account")
    public CustomerAccountDto getAccount() {
        return customerService.read(1L);
    }
}
