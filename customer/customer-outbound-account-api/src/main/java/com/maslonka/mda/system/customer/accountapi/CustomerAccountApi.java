package com.maslonka.mda.system.customer.accountapi;

import com.maslonka.mda.system.customer.accountapi.dto.CustomerAccountDto;

public interface CustomerAccountApi {
    CustomerAccountDto read(Long accountId);
}
