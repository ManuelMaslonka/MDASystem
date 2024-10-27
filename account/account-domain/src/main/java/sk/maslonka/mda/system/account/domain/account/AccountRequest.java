package sk.maslonka.mda.system.account.domain.account;

import java.math.BigDecimal;

public record AccountRequest(
        TypeOfAccount typeOfAccount,
        Balance balance
) {
}
