package polymorphisn.run_time;

public class UpiWallet extends  Payment{
    public void details(){
        System.out.println("UPI Wallet Address : "+  address);
    }

    private String address = "UPI@SBI80930303";
}
