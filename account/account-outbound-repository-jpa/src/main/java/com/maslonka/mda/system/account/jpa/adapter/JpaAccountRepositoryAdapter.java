package com.maslonka.mda.system.account.jpa.adapter;

import org.springframework.stereotype.Repository;
import com.maslonka.mda.system.account.jpa.repository.SpringDataAccountRepository;
import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountRepository;

@Repository
public class JpaAccountRepositoryAdapter implements AccountRepository {

    private final SpringDataAccountRepository accountRepository;

    public JpaAccountRepositoryAdapter(SpringDataAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account read(Long id) {
        return accountRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Account not found")
        );
    }

    @Override
    public void create(Account aggregate) {
        accountRepository.save(aggregate);
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public void update(Account aggregate) {
        accountRepository.delete(aggregate);
    }
}
