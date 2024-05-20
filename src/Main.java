import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountBank newBank = new AccountBank("01", "Quang", 100000);
        AccountBank newBank2 = new AccountBank("02", "Minh", 200000);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter amount 2 to transfers: ");
        double amount2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("--------------------Account 1-------------------");
        System.out.println("Balance after deposit: " + newBank.deposit(amount));
        System.out.println("Balance after withdraw: " + newBank.withdraw(amount));
        System.out.println("--------------------Account 2-------------------");
        System.out.println("Balance after deposit: " + newBank2.deposit(amount));
        System.out.println("Balance after withdraw: " + newBank2.withdraw(amount));
        System.out.println("-----------------------------------------------");
        System.out.println("Account 2 after transfers:" + newBank2.transfers(amount, amount2));
        System.out.println("Account 1 after transfers:" + newBank.withdraw(amount2));
    }
}