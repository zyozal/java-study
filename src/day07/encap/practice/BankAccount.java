package day07.encap.practice;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private int balance;

    BankAccount(String accountNumber, String accountHolder, int balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }



    public void deposit(int i) {
        if (i < 0) {
            System.out.println("입금액은 음수일 수 없습니다.");
            return;
        } else {
            balance += i;
        }
    }

    public void withdraw(int i) {
        if (i > balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액입니다.");
            return;
        } else {
            balance -= i;
        }
    }
}
