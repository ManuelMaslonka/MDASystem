package com.maslonka.mda.system.account.domain.account;

import java.util.List;

public interface AccountService {

    Account read(Long accountId);

    List<Account> read(List<Long> accountIds);

    void update(Account account);

    void create(AccountRequest account);

    void delete(Long accountId);

    boolean exists(Long accountId);
}
