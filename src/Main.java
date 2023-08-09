public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        HDFCAccount AayushAcc = new HDFCAccount("Aayush", "aayush123", 2000);

        System.out.println(AayushAcc); //printed the attributes via toString function

        //fetch balance
        System.out.println(AayushAcc.fetchBalance("random"));
        System.out.println(AayushAcc.fetchBalance("aayush123"));

        //add money
        System.out.println(AayushAcc.addMoney(10000));

        //withdraw
        System.out.println(AayushAcc.withdrawMoney(2000, "random"));
        System.out.println(AayushAcc.withdrawMoney(3000,"aayush123"));
        System.out.println(AayushAcc.withdrawMoney(30000,"aayush123"));

        //change password
        System.out.println(AayushAcc.changePassword("aayush123", "dexter"));
        System.out.println(AayushAcc.fetchBalance("dexter"));

        //calculate interest
        System.out.println("Interest for 5 years: " + AayushAcc.calculateInterest(5));
    }
}