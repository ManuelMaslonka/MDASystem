package com.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domainapi.dto.BalanceDomainDto;
import com.maslonka.mda.system.account.domain.account.Balance;

public interface BalanceDomainMapper {

    static BalanceDomainDto toDto(Balance balance) {
        return new BalanceDomainDto(balance.getAmount());
    }

    static Balance toEntity(BalanceDomainDto balance) {
        return new Balance(balance.amount());
    }

}
