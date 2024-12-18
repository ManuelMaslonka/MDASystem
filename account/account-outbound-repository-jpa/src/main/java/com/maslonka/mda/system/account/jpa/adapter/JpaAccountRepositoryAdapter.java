package com.maslonka.mda.system.account.jpa.adapter;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountRepository;
import com.maslonka.mda.system.account.jpa.repository.SpringDataAccountRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaAccountRepositoryAdapter implements AccountRepository {

    private final SpringDataAccountRepository accountRepository;

    public JpaAccountRepositoryAdapter(SpringDataAccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Optional<Account> read(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<Account> read(List<Long> ids) {
        return accountRepository.findAllById(ids);
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
        accountRepository.save(aggregate);
    }

    @Override
    public boolean exists(Long id) {
        return accountRepository.existsById(id);
    }
}
