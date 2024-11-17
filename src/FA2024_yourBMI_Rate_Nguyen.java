// FA2024_yourBMI_Rate_Nguyen


import java.util.Scanner;


public class FA2024_yourBMI_Rate_Nguyen {
    // Display info for inputs
    static class Display {
        public void displayUserInfo(FA2024_Adult_Nguyen user) {
            System.out.println("---------------------------------------");
            System.out.println("Your Weight Management - DUSTIN NGUYEN");
            System.out.println("Standard BMI:              18.5 - 24.9");
            System.out.println("---------------------------------------");
            String format = "%-15s%25s%n";
            System.out.printf(format, "Full Name:", user.getName());
            System.out.printf(format, "Height:", user.getHeight() + " inches");
            System.out.printf(format, "BMI Expected:", user.getBmi());
            System.out.println("---------------------------------------");
            System.out.printf(format, "Expected Weight:", user.getWeight());
        }
    }

    public static void main(String[] args) {
        // Main Menu for user input
        System.out.println("Enter your name:");
        FA2024_Adult_Nguyen user = new FA2024_Adult_Nguyen();
        Scanner scanner = new Scanner(System.in);
        user.setName(scanner.nextLine());
        System.out.println("Enter your height in inches: ");
        user.setHeight(scanner.nextFloat());
        System.out.println("Enter your goal bmi: ");
        user.setBmi(scanner.nextDouble());
        user.calculateWeight();
        Display display = new Display();
        display.displayUserInfo(user);
    }
}