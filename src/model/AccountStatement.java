package model;

import util.OperationType;

import java.time.LocalDate;

public class AccountStatement {

    private int id;
    private double amount;
    private double balance;
    private LocalDate date;
    private OperationType operationType;

    public AccountStatement() {
    }

    public AccountStatement(int id, double amount, double balance, LocalDate date, OperationType operationType) {
        this.id = id;
        this.amount = amount;
        this.balance = balance;
        this.date = date;
        this.operationType = operationType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }
}
