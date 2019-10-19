import java.util.*;
import java.security.SecureRandom;
public class Checkan_p1 {
    public static int firstNum;
    public static int secondNum;
    public static int productIn;
    public static int correct = 0;
    public static int numRight = 0;
    public static int numWrong = 0;
    public static int loopProgram = 0;
    public static int m;
    public static int n = 0;
    public static int arithChoice;
    public static double divIn;
    public static int randomArithmatic;
    public static void main(String args[])
    {
        while (loopProgram == 0)
        {
            setDifficultyLevel();
            setArithmatic();
            //Repeat this loop using new numbers each time
            while (correct == 0) {
                // Run the program up to a maximum of 10 times
                for (int i = 0; i < 10; i++)
                {
                    switch (arithChoice)
                    {
                        case 1:
                            Scanner addInput = new Scanner(System.in);
                            makeAdd();
                            productIn = addInput.nextInt();
                            addition(firstNum,secondNum,productIn);
                            break;
                        case 2:
                            Scanner userInput = new Scanner(System.in);
                            makeMultiply();
                            productIn = userInput.nextInt();
                            // Multiply and check to see if the user answer is correct
                            multiply(firstNum, secondNum, productIn);
                            break;
                        case 3:
                            Scanner subInput = new Scanner(System.in);
                            makeSubtract();
                            productIn = subInput.nextInt();
                            subtraction(firstNum,secondNum,productIn);
                            break;
                        case 4:
                            Scanner divInput = new Scanner(System.in);
                            makeDiv();
                            divIn = divInput.nextDouble();
                            division(firstNum,secondNum,productIn);
                        case 5:
                            randomChoice();
                    }

                }
            }
            checkRightWrong();
            checkContinue();
        }
}
    public static int getFirstNum(int first)
    {
        SecureRandom random = new SecureRandom();
        firstNum = random.nextInt(10 + m) + n;
        return first;
    }
    public static int getSecondNum(int second)
    {
        SecureRandom random = new SecureRandom();
        secondNum = random.nextInt(10 + m) + n;
        return second;
    }
    public static void makeMultiply()
    {
        getFirstNum(firstNum);
        getSecondNum(secondNum);
        System.out.println("How much is " + firstNum + " times " + secondNum + "?");
    }
    public static void multiply(int firstNum, int secondNum, int userNum)
    {
        int product = firstNum * secondNum;
        if (userNum == product)
        {
            correctResponse();
            correct = 1;
            numRight++;
        }
        else
        {
            wrongResponse();
            numWrong++;
            // This is in case the user gets all 10 questions incorrect, the program will still stop
            if (numWrong == 10)
            {
                correct = 1;
            }
        }
    }
    public static void correctResponse()
    {
        int response;
        SecureRandom randResponse = new SecureRandom();
        response = randResponse.nextInt(4);
        switch (response)
        {
            case 0:
                System.out.println("Very Good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice Work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }
    public static void wrongResponse()
    {
        int response;
        SecureRandom randResponse = new SecureRandom();
        response = randResponse.nextInt(4);
        switch (response)
        {
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don’t give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }
    public static void checkRightWrong()
    {
        System.out.println("You got " + numRight + " correct and you got " + numWrong + " incorrect");
        double percentCorrect = (double) numRight / 10;
        percentCorrect = percentCorrect * 100;
        System.out.println("You got a " + percentCorrect);
        if (percentCorrect < 75)
        {
            System.out.println("Please ask your teacher for extra help");
        }
        else
        {
            System.out.println("Congratulations, you are ready to go to the next level");
        }
    }
    public static void checkContinue()
    {
        Scanner continueProgram = new Scanner(System.in);
        System.out.println("Press 1 to continue, press any other key to exit");
        int continueCheck = continueProgram.nextInt();
        if (continueCheck != 1)
        {
            loopProgram = 1;
        }
        else
            {
            correct = 0;
            numRight = 0;
            numWrong = 0;
        }
        }
    public static void setDifficultyLevel()
    {
        Scanner difficultyChoice = new Scanner(System.in);
        System.out.println("Select a Difficulty Level: ");
        int setDifficulty = difficultyChoice.nextInt();
        if (setDifficulty == 1)
        {
            m = 0;
        }
        else if (setDifficulty == 2)
        {
            m = 90;
        }
        else if (setDifficulty == 3)
        {
            m = 990;
        }
        else if (setDifficulty == 4)
        {
            m = 9990;
        }
    }
    public static void setArithmatic()
    {
        System.out.println("Press 1 for Addition:");
        System.out.println("Press 2 for Multiplication:");
        System.out.println("Press 3 for Subtraction");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for a random mixture");
        Scanner arith = new Scanner(System.in);
        arithChoice = arith.nextInt();
        if (arithChoice == 4)
        {
            System.out.println("Be sure to input all answers to 2 decimal places. eg: 2 would be input at 2.00");
            n=1;
        }
    }
    public static void makeAdd()
    {
        getFirstNum(firstNum);
        getSecondNum(secondNum);
        System.out.println("How much is " + firstNum + " plus " + secondNum + "?");
    }
    public static void addition(int firstNum, int secondNum, int userNum)
    {
        int sum = firstNum + secondNum;
        if (userNum == sum)
        {
            correctResponse();
            correct = 1;
            numRight++;
        }
        else
        {
            wrongResponse();
            numWrong++;
            // This is in case the user gets all 10 questions incorrect, the program will still stop
            if (numWrong == 10)
            {
                correct = 1;
            }
        }
    }
    public static void makeSubtract()
    {
        getFirstNum(firstNum);
        getSecondNum(secondNum);
        System.out.println("How much is " + firstNum + " minus " + secondNum + "?");
    }
    public static void subtraction(int firstNum, int secondNum, int userNum)
    {
        int sum = firstNum - secondNum;
        if (userNum == sum)
        {
            correctResponse();
            correct = 1;
            numRight++;
        }
        else
        {
            wrongResponse();
            numWrong++;
            // This is in case the user gets all 10 questions incorrect, the program will still stop
            if (numWrong == 10)
            {
                correct = 1;
            }
        }
    }
    public static void makeDiv()
    {
        getFirstNum(firstNum);
        getSecondNum(secondNum);
        System.out.println("How much is " + firstNum + " divided by " + secondNum + "?");
    }
    public static void division(int firstNum, int secondNum, int userNum)
    {
        double div = (double)firstNum / (double)secondNum;
        div = Math.round(div * 10) / 10;
        if (userNum == div)
        {
            correctResponse();
            correct = 1;
            numRight++;
        }
        else
        {
            wrongResponse();
            numWrong++;
            // This is in case the user gets all 10 questions incorrect, the program will still stop
            if (numWrong == 10)
            {
                correct = 1;
            }
        }
    }
    public static void randomChoice()
    {
        SecureRandom randChoice = new SecureRandom();
        randomArithmatic = randChoice.nextInt(4);
        switch (randomArithmatic)
        {
            case 0:
                Scanner addInput = new Scanner(System.in);
                makeAdd();
                productIn = addInput.nextInt();
                addition(firstNum,secondNum,productIn);
                break;
            case 1:
                Scanner userInput = new Scanner(System.in);
                makeMultiply();
                productIn = userInput.nextInt();
                multiply(firstNum, secondNum, productIn);
                break;
            case 2:
                Scanner subInput = new Scanner(System.in);
                makeSubtract();
                productIn = subInput.nextInt();
                subtraction(firstNum,secondNum,productIn);
                break;
            case 3:
                Scanner divInput = new Scanner(System.in);
                makeDiv();
                divIn = divInput.nextDouble();
                division(firstNum,secondNum,productIn);
                break;
        }
    }
}

