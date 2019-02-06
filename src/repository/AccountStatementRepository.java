package repository;

import model.AccountStatement;

import java.util.List;

public interface AccountStatementRepository {

    void deposit(int id, double amount);
    void withdrawal(int id, double amount);
    List<AccountStatement> historyOperation();
}
