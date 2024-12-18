package com.maslonka.mda.system.customer.domain.account;

import com.maslonka.mda.system.customer.domain.customer.TypeOfAccount;

import java.math.BigDecimal;

public class Account {
    private Long id;
    private TypeOfAccount typeOfAccount;
    private BigDecimal balance;
}
