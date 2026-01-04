package homeworks10;

public class BankAccount {

    private String accountHolderName;
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName){
        this.accountHolderName = accountHolderName;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0;
    }

    private String generateAccountNumber(){
        return "ACC" + (int)(Math.random() * 1000000);
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0 ){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrwn: " + amount);;
        } else {
            System.out.println("isuficient founds or invalit amount");
        }
    }
}
class TestBankAccount{
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Papuc ion");

        System.out.println("Account holder: " + account.getAccountHolderName());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Final balance: " + account.getBalance());
    }
}
