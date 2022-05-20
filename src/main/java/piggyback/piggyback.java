package piggyback;

public class piggyback {
    double pennies;
    double Nickels;
    double Dimes;
    double Quarters;

    public piggyback(double p, double n, double d, double q) {
        this.pennies = p;
        this.Nickels = n;
        this.Dimes = d;
        this.Quarters = q;
    }

    public double getTotalamount() {
        double total = (pennies * 0.01) + (Nickels * 0.05) + (Dimes * 0.10) + (Quarters * 0.25);
        return total;
    }
}
