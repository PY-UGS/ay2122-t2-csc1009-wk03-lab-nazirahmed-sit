import java.util.Date;

class Loan {

    double annualInterestRate;
    int numberOfYears;
    double loanAmount;
    Date loanDate = new Date();

    public Loan() {

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        return (loanAmount * (annualInterestRate / 1200)) /
                (1 - (1 / Math.pow(1 + annualInterestRate / 1200, numberOfYears * 12)));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

}
