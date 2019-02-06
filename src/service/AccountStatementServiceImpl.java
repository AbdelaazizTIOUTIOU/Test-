package service;

import model.AccountStatement;
import repository.AccountStatementRepository;

import java.util.List;

public class AccountStatementServiceImpl implements AccountStatementService {

    private AccountStatementRepository statementRepository;

    public AccountStatementServiceImpl(AccountStatementRepository statementRepository) {
        this.statementRepository = statementRepository;
    }

    @Override
    public void deposit(int id, double amount) {
        statementRepository.deposit(id, amount);
    }

    @Override
    public void withdrawal(int id, double amount) {
        statementRepository.withdrawal(id, amount);
    }

    @Override
    public List<AccountStatement> historyOperation() {
        return statementRepository.historyOperation();
    }
}
