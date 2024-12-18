package com.maslonka.mda.system.customer.domain.utills;

public interface ValueObject<E> {
    boolean sameValueAs(E other);
}
