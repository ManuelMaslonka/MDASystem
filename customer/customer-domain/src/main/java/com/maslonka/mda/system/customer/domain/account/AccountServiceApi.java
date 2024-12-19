package com.maslonka.mda.system.customer.domain.account;

import java.util.List;

public interface AccountServiceApi {
    Account read(Long accountId);
    boolean exists(Long accountId);
    List<Account> readAll();
}
