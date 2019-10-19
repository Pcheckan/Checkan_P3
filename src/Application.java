public class Application extends SavingsAccount {
    public static void main(String[] args)
    {
        SavingsAccount user1;
        SavingsAccount user2;
        // Start both accounts with a balance
        user1 = new SavingsAccount(2000);
        user2 = new SavingsAccount(3000);
        // set interest rate to 4%
        SavingsAccount.changeInterestRate(0.04);
        // run for all 12 months for each user
        for (int i = 0; i < 12; i++)
        {
            user1.calculateInterest();
            System.out.println("User 1: Month " + (i+1) + ": " + user1.getSavingBalance());
            user2.calculateInterest();
            System.out.println("User 2: Month " + (i+1) + ": " + user2.getSavingBalance());
        }
        // change interest rate to 5%
        SavingsAccount.changeInterestRate(0.05);
        System.out.println("Changing the interest rate from 4% to 5%");
        {
            // run again 12 months for both users
            for (int j = 0; j < 12; j++)
            {
                user1.calculateInterest();
                System.out.println("User 1: Month " + (j+1) + ": " + user1.getSavingBalance());
                user2.calculateInterest();
                System.out.println("User 2: Month " + (j+1) + ": " + user2.getSavingBalance());
            }
        }

    }
}
