package com.maslonka.mda.system.account.domain.account;

public class AccountFacade implements AccountService {

    private final AccountRepository accountRepository;

    public AccountFacade(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account read(Long accountId) {
        return accountRepository.read(accountId);
    }

    @Override
    public void update(Account account) {
        accountRepository.update(account);
    }

    @Override
    public void create(AccountRequest account) {
        Account newAccount = AccountBuilder.Account()
                .typeOfAccount(account.typeOfAccount())
                .balance(account.balance())
                .build();
        accountRepository.create(newAccount);
    }

    @Override
    public void delete(Long accountId) {
        accountRepository.delete(accountId);
    }
}
