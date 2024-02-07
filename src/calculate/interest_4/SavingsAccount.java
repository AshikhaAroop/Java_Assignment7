package calculate.interest_4;

public class SavingsAccount extends Account{

    public SavingsAccount(double amount, int timePeriod, float rate) {
        super(amount, timePeriod, rate);
    }
    public double calculateInterest(float rate){
        return super.calculateInterest(rate);
    }
    public void displayInterest(float rate){
        System.out.println("Interest calculated for Savings account is: "+calculateInterest(rate));
    }

}
