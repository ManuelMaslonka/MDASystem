package com.maslonka.mda.system.account.domain.account;

public record AccountRequest(
        TypeOfAccount typeOfAccount,
        Balance balance
) {
}