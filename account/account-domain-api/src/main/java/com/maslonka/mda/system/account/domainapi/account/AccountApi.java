package com.maslonka.mda.system.account.domainapi.account;

import com.maslonka.mda.system.account.domainapi.account.dto.AccountDomainDto;
import com.maslonka.mda.system.account.domainapi.account.dto.AccountRequestDomainDto;

import java.util.List;

public interface AccountApi {

    AccountDomainDto read(Long accountId);

    List<AccountDomainDto> read(List<Long> accountIds);

    void create(AccountRequestDomainDto account);

    void update(AccountDomainDto account);

    void delete(Long accountId);

    boolean exists(Long accountId);
}
