package calculate.interest_4;

public class CheckingAccount extends Account{

    public CheckingAccount(double amount, int timePeriod, float rate) {
        super(amount,timePeriod,rate);
    }

    public double calculateInterest(float rate){
        return super.calculateInterest(rate);
    }

    public void displayInterest(float rate){
        System.out.println("Interest calculated for Checking account is:"+calculateInterest(rate));
    }
}
