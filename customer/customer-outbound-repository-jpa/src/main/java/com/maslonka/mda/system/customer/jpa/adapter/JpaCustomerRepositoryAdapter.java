package com.maslonka.mda.system.customer.jpa.adapter;

import com.maslonka.mda.system.customer.domain.customer.Customer;
import com.maslonka.mda.system.customer.domain.customer.CustomerRepository;
import com.maslonka.mda.system.customer.jpa.repository.SpringDataCustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaCustomerRepositoryAdapter implements CustomerRepository {

    private final SpringDataCustomerRepository springDataCustomerRepository;

    public JpaCustomerRepositoryAdapter(SpringDataCustomerRepository springDataCustomerRepository) {
        this.springDataCustomerRepository = springDataCustomerRepository;
    }

    @Override
    public Optional<Customer> read(Long id) {
        return springDataCustomerRepository.findById(id);
    }

    @Override
    public void create(Customer aggregate) {
        springDataCustomerRepository.save(aggregate);
    }

    @Override
    public void delete(Long id) {
        springDataCustomerRepository.deleteById(id);
    }

    @Override
    public void update(Customer aggregate) {
        springDataCustomerRepository.save(aggregate);
    }
}
