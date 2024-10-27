package sk.maslonka.mda.system.account.domain.account;

public final class AccountBuilder {
    private Balance balance;
    private TypeOfAccount typeOfAccount;

    private AccountBuilder() {
    }

    public static AccountBuilder Account() {
        return new AccountBuilder();
    }

    public AccountBuilder balance(Balance balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder typeOfAccount(TypeOfAccount typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
        return this;
    }

    public Account build() {
        return new Account(typeOfAccount, balance);
    }
}
