public class BankAccount implements Account {

    int balance;

    BankAccount(int balance){
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    @Override
    public void deposit(int amount) {
        if (amount<=0){
            throw new IllegalArgumentException("amount must be greater than 0");
        }
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= 0){
            throw new IllegalArgumentException("amount must be greater than 0");
        }
        balance -= amount;
    }
}
