package com.maslonka.mda.system.customer.domain.accountapi;

import com.maslonka.mda.system.customer.domain.accountapi.dto.CustomerAccountDto;

import java.util.List;

public interface AccountServiceApi {
    CustomerAccountDto read(Long accountId);
    List<CustomerAccountDto> read(List<Long> accountIds);
    boolean exists(Long accountId);
}
