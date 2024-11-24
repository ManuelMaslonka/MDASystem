package com.maslonka.mda.system.account.jpa.repository;

import com.maslonka.mda.system.account.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataTransactionRepository extends JpaRepository<Transaction, Long> {
}
