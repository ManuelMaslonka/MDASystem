package sk.maslonka.mda.system.account.domain.utills;

public interface ValueObject<E> {
    boolean sameValueAs(E other);
}
