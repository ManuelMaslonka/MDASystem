package sk.maslonka.mda.system.account.domain.utills;

public interface DomainRepository<T extends AggregateRoot<I>, I> {
    T read(I id);
    void create(T aggregate);
    void delete(I id);
    void update(T aggregate);
}
