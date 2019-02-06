package service;

import model.AccountStatement;

import java.util.List;

public interface AccountStatementService {

    void deposit(int id, double amount);
    void withdrawal(int id, double amount);
    List<AccountStatement> historyOperation();
}
