package calculate.interest_4;

public class Account {

    private final double balance;
    private double rate;
    private final int timePeriodInYears;

    public Account(double balance, int timePeriodInYears, double rate) {
        this.balance = balance;
        this.timePeriodInYears=timePeriodInYears;
        this.rate=rate;
    }
    public double calculateInterest(float rate){
        this.rate=rate;
        return (balance*rate*timePeriodInYears)/100;
    }

    public void displayDetails(){
        System.out.println("Amount is "+balance+"\nTimePeriod is "+
                timePeriodInYears+"\nRate is "+rate);
    }
}
