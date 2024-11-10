package com.maslonka.mda.system.account.domain.account;

public interface AccountService {
    Account read(Long accountId);
    void update(Account account);
    void create(AccountRequest account);
    void delete(Long accountId);
}
