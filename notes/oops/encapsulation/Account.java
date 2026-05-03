package encapsulation;

public class Account {

    private double balance;

    // public setter (controls access)
    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
            validateBalance(balance); // calling private method internally
        }else{
            insufficientBalance(balance);
        }
    }

    // public getter
    public double getBalance() {
        return balance;
    }

    // private method (internal logic only)
    private void validateBalance(double balance) {
        System.out.println("Balance validated: " + balance);
    }

    private void insufficientBalance(double balance){
        System.out.println("Balance Insufficient Add more Funds !!"+balance);
    }
}