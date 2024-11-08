package sk.maslonka.mda.system.account.domain.mapper;

import com.maslonka.mda.system.account.domainapi.dto.BalanceDomainDto;
import sk.maslonka.mda.system.account.domain.account.Balance;

public abstract class BalanceDomainMapper {

    public static BalanceDomainDto toDto(Balance balance) {
        return new BalanceDomainDto(balance.getAmount());
    }

    public static Balance toEntity(BalanceDomainDto balance) {
        return new Balance(balance.amount());
    }

}
