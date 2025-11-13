package ExcercicioException;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number,String holder,double balance,double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws OverLimitException, OverBalanceException{
        if (amount> withdrawLimit) {
            throw new OverLimitException("The amount exeeds withdraw limit");
        }
        if (amount > balance) {
            throw new OverBalanceException("Not enough balance");
        }
        balance -= amount;
    }

    public String toString(){
        return "New balance: " + balance;
    }
}