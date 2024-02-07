package calculate.interest_4;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        System.out.println("*********************Interest Calculator*******************");
        System.out.println("Please enter the amount, time periods(in years)");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        int timePeriod=sc.nextInt();
        System.out.println("Please enter interest rate for Savings Account");
        float savingsRate=sc.nextFloat();
        System.out.println("Please enter interest rate for Checking Account");
        float checkingRate=sc.nextFloat();
        SavingsAccount sa=new SavingsAccount(amount, timePeriod, savingsRate);
        CheckingAccount ca= new CheckingAccount(amount, timePeriod, checkingRate);
        System.out.println("Savings Account Calculation:");
        sa.displayDetails();
        sa.displayInterest(savingsRate);
        System.out.println("--------------------------------------------------------");
        System.out.println("Checking Account Calculation:");
        ca.displayDetails();
        ca.displayInterest(checkingRate);
    }




}
