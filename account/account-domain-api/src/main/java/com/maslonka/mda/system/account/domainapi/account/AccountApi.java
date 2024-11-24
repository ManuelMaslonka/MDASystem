package com.maslonka.mda.system.account.domainapi.account;

import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDto;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountRequestDomainDto;

public interface AccountApi {
    AccountDomainDto read(Long accountId);

    void create(AccountRequestDomainDto account);

    void update(AccountDomainDto account);

    void delete(Long accountId);

}
