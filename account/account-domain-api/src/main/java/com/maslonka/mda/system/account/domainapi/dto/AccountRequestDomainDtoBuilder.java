package com.maslonka.mda.system.account.domainapi.dto;

public final class AccountRequestDomainDtoBuilder {
    private TypeOfAccountDomainDto typeOfAccount;
    private BalanceDomainDto balance;

    private AccountRequestDomainDtoBuilder() {
    }

    public static AccountRequestDomainDtoBuilder anAccountRequestDto() {
        return new AccountRequestDomainDtoBuilder();
    }

    public AccountRequestDomainDtoBuilder withTypeOfAccount(TypeOfAccountDomainDto typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
        return this;
    }

    public AccountRequestDomainDtoBuilder withBalance(BalanceDomainDto balance) {
        this.balance = balance;
        return this;
    }

    public AccountRequestDomainDto build() {
        return new AccountRequestDomainDto(typeOfAccount, balance);
    }
}
