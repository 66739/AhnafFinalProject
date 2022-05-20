package InvestmentCalculator;

public class Investment {
    double deposit;
    int compoundingPeriods;
    double interestRate;
    double desiredAmount;

    public Investment(double d, int c, double i, double da){
        this.deposit = d;
        this.compoundingPeriods = c;
        this.interestRate = i;
        this.desiredAmount = da;
    }
    public double getTime(){
        double time = (Math.log10(desiredAmount/deposit) / Math.log10((1 + interestRate / compoundingPeriods))) / compoundingPeriods;
        return time;
    }
    public double getNeededDeposit(double timeInput){
        double neededDeposit = desiredAmount / (Math.pow((1 + interestRate / compoundingPeriods), (timeInput * compoundingPeriods)));
        return neededDeposit;
    }
}
