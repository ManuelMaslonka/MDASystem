package com.maslonka.mda.system.account.domainapi;

import com.maslonka.mda.system.account.domainapi.dto.AccountDomainDto;
import com.maslonka.mda.system.account.domainapi.dto.AccountRequestDomainDto;

public interface AccountApi {
    AccountDomainDto read(Long accountId);

    void create(AccountRequestDomainDto account);

    void update(AccountDomainDto account);

    void delete(Long accountId);

}
