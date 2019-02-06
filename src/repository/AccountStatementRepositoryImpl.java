package repository;

import model.AccountStatement;
import util.OperationType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AccountStatementRepositoryImpl implements AccountStatementRepository {

    List<AccountStatement> accountStatementMocks = new ArrayList<>();

    //initialize and insert some data into the list
    public AccountStatementRepositoryImpl() {
        accountStatementMocks = Arrays.asList(new AccountStatement(1, 200.00, 3000.00, LocalDate.now(), OperationType.CREDIT),
                new AccountStatement(2, 10.00, 2000.00, LocalDate.now(), OperationType.DEBIT),
                new AccountStatement(3, 50.00, 1000.00, LocalDate.now(), OperationType.CREDIT));
    }

    @Override
    public void deposit(int id, double amount) {
        accountStatementMocks.stream().filter(a -> {
            if (a.getId() == id) {
                a.setAmount(amount);
                a.setBalance(a.getBalance() + amount);
                a.setDate(LocalDate.now());
                a.setOperationType(OperationType.CREDIT);
            }
            return true;
        });
    }

    @Override
    public void withdrawal(int id, double amount) {
        accountStatementMocks.stream().filter(a -> {
            if (a.getId() == id) {
                a.setAmount(amount);
                a.setBalance(a.getBalance() - amount);
                a.setDate(LocalDate.now());
                a.setOperationType(OperationType.DEBIT);
            }
            return true;
        });
    }

    @Override
    public List<AccountStatement> historyOperation() {
        return accountStatementMocks;
    }
}
