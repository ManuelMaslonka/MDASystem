package com.maslonka.mda.system.customer.jpa.repository;

import com.maslonka.mda.system.customer.domain.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCustomerRepository extends JpaRepository<Customer, Long> {
}
