package com.maslonka.mda.system.account.jpa.adapter;

import com.maslonka.mda.system.account.domain.transaction.Transaction;
import com.maslonka.mda.system.account.domain.transaction.TransactionRepository;
import com.maslonka.mda.system.account.jpa.repository.SpringDataTransactionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaTransactionRepositoryAdapter implements TransactionRepository {

    private final SpringDataTransactionRepository repository;

    public JpaTransactionRepositoryAdapter(SpringDataTransactionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Transaction> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Transaction> read(List<Long> ids) {
        return repository.findAllById(ids);
    }

    @Override
    public void create(Transaction aggregate) {
        repository.save(aggregate);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Transaction aggregate) {
        repository.save(aggregate);
    }

    @Override
    public boolean exists(Long id) {
        return repository.existsById(id);
    }
}
