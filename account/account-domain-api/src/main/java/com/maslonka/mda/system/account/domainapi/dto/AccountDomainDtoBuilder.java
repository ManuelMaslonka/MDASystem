package com.maslonka.mda.system.account.domainapi.dto;

public final class AccountDomainDtoBuilder {
    private Long id;
    private TypeOfAccountDomainDto typeOfAccount;
    private BalanceDomainDto balance;

    private AccountDomainDtoBuilder() {
    }

    public static AccountDomainDtoBuilder anAccountDto() {
        return new AccountDomainDtoBuilder();
    }

    public AccountDomainDtoBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public AccountDomainDtoBuilder withTypeOfAccount(TypeOfAccountDomainDto typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
        return this;
    }

    public AccountDomainDtoBuilder withBalance(BalanceDomainDto balance) {
        this.balance = balance;
        return this;
    }

    public AccountDomainDto build() {
        return new AccountDomainDto(id, typeOfAccount, balance);
    }
}
