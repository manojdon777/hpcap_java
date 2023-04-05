package assignments;
public class Account {
    private int accountNumber;
    private String name, ifsc;
    private double balance;
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIfsc() {
        return ifsc;
    }
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account(int accountNumber, String name, String ifsc, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.ifsc = ifsc;
        if(balance > 1000)
            this.balance = balance;
        else
            System.out.println("Minimum balance should be more than 1000");
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("balance = " + this.balance);
    }
    public void withdraw(double amount){
        if(this.balance < amount)
            System.out.println("Insufficient balance");
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return  "Acc No = " + accountNumber + ", Name = " + name + ", IFSC = " + ifsc + ", Balance = " + balance;
    }
}
/*Create bank application
                Create Account POJO class
                acc_number, name, IFSC, balance
                While creating account balance should be 1000 Rs. If account
                opening balance is less than 1000 then Account will show proper message
* */