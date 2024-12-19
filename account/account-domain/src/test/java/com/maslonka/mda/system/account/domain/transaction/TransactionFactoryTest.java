package com.maslonka.mda.system.account.domain.transaction;

import com.maslonka.mda.system.account.domain.account.Account;
import com.maslonka.mda.system.account.domain.account.AccountService;
import com.maslonka.mda.system.account.domain.account.Balance;
import com.maslonka.mda.system.account.domain.account.TypeOfAccount;
import com.maslonka.mda.system.account.domain.transaction.proccesor.DepositTransaction;
import com.maslonka.mda.system.account.domain.transaction.request.DepositRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class TransactionFactoryTest {

    private AccountService accountService;
    private TransactionFactory transactionFactory;

    @BeforeEach
    void setUp() {
        accountService = Mockito.mock(AccountService.class);
        transactionFactory = new TransactionFactory(accountService);
    }

    @Test
    void createDepositTransaction() {
        Long accountId = 1L;
        Balance amount = new Balance(BigDecimal.valueOf(100.00));
        Account account = new Account(accountId, TypeOfAccount.SAVINGS, amount);

        when(accountService.read(accountId)).thenReturn(account);

        Transaction transaction = transactionFactory.createTransaction(new DepositRequest(accountId, amount));

        assertEquals(DepositTransaction.class, transaction.getClass());

    }


}
