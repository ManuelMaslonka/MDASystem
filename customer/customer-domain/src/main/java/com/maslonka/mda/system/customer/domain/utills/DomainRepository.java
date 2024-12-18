package com.maslonka.mda.system.customer.domain.utills;


import java.util.Optional;

public interface DomainRepository<T extends AggregateRoot<I>, I> {
    Optional<T> read(I id);
    void create(T aggregate);
    void delete(I id);
    void update(T aggregate);
}
