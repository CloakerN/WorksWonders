import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0; // Initial balance
        boolean running = true;

        System.out.println("Welcome to the Simple Bank!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Check Balance
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 2: // Deposit Money
                    System.out.print("Enter the amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Successfully deposited $" + deposit);
                    } else {
                        System.out.println("Invalid amount. Please enter a positive number.");
                    }
                    break;

                case 3: // Withdraw Money
                    System.out.print("Enter the amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Successfully withdrew $" + withdraw);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive number.");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using Simple Bank. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

