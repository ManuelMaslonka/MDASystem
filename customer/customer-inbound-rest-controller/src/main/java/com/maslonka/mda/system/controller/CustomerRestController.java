package com.maslonka.mda.system.controller;

import com.maslonka.mda.system.customer.accountapi.OutboundAccountApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.maslonka.mda.system.account.domain.account.Account;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    private final OutboundAccountApi customerService;

    public CustomerRestController(OutboundAccountApi customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/hello")
    public String hello() {
        Account read = customerService.read(10L);
        String readString = read.toString();
        return readString;
    }
}
