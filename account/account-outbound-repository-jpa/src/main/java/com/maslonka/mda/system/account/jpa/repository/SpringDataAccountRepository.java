package com.maslonka.mda.system.account.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.maslonka.mda.system.account.domain.account.Account;

public interface SpringDataAccountRepository extends JpaRepository<Account, Long> {
}
