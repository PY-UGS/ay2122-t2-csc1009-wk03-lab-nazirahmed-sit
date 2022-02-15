import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate_input = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears_input = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount_input = input.nextDouble();

        Loan loan = new Loan(annualInterestRate_input, numberOfYears_input, loanAmount_input);

        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.printf("The monthly payment is %.2f", loan.getMonthlyPayment());
        System.out.printf("\nThe total payment is %.2f", loan.getTotalPayment());

    }
}
