import java.util.Scanner;
public class Bank {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){


        double balance = 0.00;
        boolean isRunning = true;
        int choice = 0;

        while(isRunning) {
            System.out.println("*************");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            System.out.print("Select (1-4): ");
            choice = scanner.nextInt();
            System.out.println("*************");


            switch (choice) {
                case 1 -> balance += deposit();
                case 2 -> balance -= withdraw(balance);
                case 3 -> System.out.printf("Your balance is $%.2f\n",balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Input a number from 1-4!");

            }
        }
        scanner.close();
    }
    public static double deposit(){

        double amount;
        System.out.print("Input an amount: ");
        amount = scanner.nextDouble();

        if(amount<=0){
            System.out.println("Amount can't be negative!");
            return 0;
        }
        else{
            return amount;
        }

    }
    public static double withdraw(double balance){

        double amount;

        System.out.print("Input amount: ");
        amount = scanner.nextDouble();

        if(amount > balance || amount <= 0){
            System.out.println("Withdraw cannot exceed current balance");
            return 0;
        }
        else{
            return amount;
        }
    }
}
