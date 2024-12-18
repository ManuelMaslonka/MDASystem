package com.maslonka.mda.system.account.domain.utills;

import java.util.List;
import java.util.Optional;

public interface DomainRepository<T extends AggregateRoot<I>, I> {
    Optional<T> read(I id);
    List<T> read(List<I> ids);
    void create(T aggregate);
    void delete(I id);
    void update(T aggregate);
    boolean exists(I id);
}
