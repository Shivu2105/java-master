package encapsulation;

public class Bank {
    static void main() {
        getBalance();
    }

    public static void getBalance(){
        Account account = new Account();
        // Here Encapsulation is achieved
        // Private Variable are used through use of Getter and Setter
        account.setBalance(0.00);
    }
}
