package com.maslonka.mda.system.account.domainapi.account.dto;

public final class AccountDomainDtoBuilder {
    private Long id;
    private TypeOfAccountDomainDto typeOfAccount;
    private BalanceDomainDto balance;

    private AccountDomainDtoBuilder() {
    }

    public static AccountDomainDtoBuilder AccountDto() {
        return new AccountDomainDtoBuilder();
    }

    public AccountDomainDtoBuilder Id(Long id) {
        this.id = id;
        return this;
    }

    public AccountDomainDtoBuilder typeOfAccount(TypeOfAccountDomainDto typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
        return this;
    }

    public AccountDomainDtoBuilder balance(BalanceDomainDto balance) {
        this.balance = balance;
        return this;
    }

    public AccountDomainDto build() {
        return new AccountDomainDto(id, typeOfAccount, balance);
    }
}
