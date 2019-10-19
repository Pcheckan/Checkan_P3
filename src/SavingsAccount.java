public class SavingsAccount {
    private static double annualInterestRate;
    private double savingBalance;
    // constructors
    public SavingsAccount()
    {

    }
    public SavingsAccount(double savingBalance)
    {
        this.savingBalance = savingBalance;
    }
    public double getSavingBalance()
    {
        return this.savingBalance;
    }
    //methods
    public static void changeInterestRate(double changedInterestRate)
    {
        annualInterestRate = changedInterestRate;
    }
    public void calculateInterest()
    {
        // Give us the monthly interest
        double monthlyInterest = (double)(this.savingBalance*annualInterestRate/12);
        this.savingBalance = this.savingBalance + monthlyInterest;
    }

}

