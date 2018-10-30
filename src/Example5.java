public class Example5 implements BankTransfer {

    @Override
    public void transfer(BankAccount from, BankAccount to, int amount) {
        int TRANSFER_FEE = 1;
        if (from.balance < amount + TRANSFER_FEE){
            throw new IllegalStateException("Insufficient funds on the account");
        }
        from.withdraw(amount + TRANSFER_FEE);
        to.deposit(amount);
    }

    public static void main(String[] args){
        Example5 customer = new Example5();
        BankAccount accountOne = new BankAccount(125);
        BankAccount accountTwo = new BankAccount(190);

        System.out.println("First account before transfer: " + accountOne.getBalance());
        System.out.println("Second account before transfer: " + accountTwo.getBalance());
        customer.transfer(accountOne,accountTwo,50);
        System.out.println("First account after transfer: " + accountOne.getBalance());
        System.out.println("Second account after transfer: " + accountTwo.getBalance());
    }
}
