public class AccountBank {
    public String accountNumber;
    public String accountHolerName;
    public double balance;


    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holer Name: " + accountHolerName);
        System.out.println("Account Balance: " + balance);
    }

    public double deposit(double amount){
        return balance + amount;
    }

    public double withdraw(double amount){
        return balance - amount;
    }

    public double transfers(double amount1, double amount2){
        return balance - amount1 + amount2;
    }


    public AccountBank(String accountNumber, String accountHolerName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolerName = accountHolerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolerName() {
        return accountHolerName;
    }

    public void setAccountHolerName(String accountHolerName) {
        this.accountHolerName = accountHolerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
