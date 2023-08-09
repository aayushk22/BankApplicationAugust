import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String name;
    //parameterised constructor
    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID()); //will create a unique string
    }

    //default constructor
    public HDFCAccount() {
    }

    private String accountNo; // should be unique number
    final String IFSCCode = "HDFC374873";
    private String password;
    private double balance;
    final double rateOfInterest = 7.1;
    @Override
    public String fetchBalance(String password) {

        if (this.password.equals(password)) {
            return "Your Balance is: " + this.balance;
        }
        return "Incorrect Password!!!";
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Amount added successfully! New Balance is: " + this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if (this.password.equals(password)) {
            if (this.balance < amount) {
                return "Insufficient Balance";
            }
            this.balance -= amount;
            return "Amount deducted successfully. New Balance: " + this.balance;
        }

        return "Incorrect Password!!!";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return "Password changed successfully";

        }
        return "Incorrect original password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance * year * rateOfInterest)/100.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    @Override
    public String toString() {
        //without this method printing the object from the main function will print the address of the object
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", IFSCCode='" + IFSCCode + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                '}';
    }
}
