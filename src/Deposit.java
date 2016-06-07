
public class Deposit {
    String bankName;
    int bankRating;
    String deposinName;
    private boolean earlyDissolution;
    private double term; //in months
    private double percent; //in a year
    private int minSum;
    private boolean monthlyReplenishment;



    public Deposit (String bankName, int bankRating, String depositName, int minSum, double term, double percent, boolean earlyDissolution, boolean monthlyReplenishment) {
        this.bankName=bankName;
        this.bankRating=bankRating;
        this.deposinName=depositName;
        this.earlyDissolution=earlyDissolution;
        this.monthlyReplenishment=monthlyReplenishment;
        this.minSum=minSum;
        this.percent=percent;
        this.term=term;

    }

    public boolean isEarlyDissolution() {
        return earlyDissolution;
    }

    public double getTerm() {
        return term;
    }

    public double getPercent() {
        return percent;
    }

    public int getMinSum() {
        return minSum;
    }



    public boolean isMonthlyReplenishment() {
        return monthlyReplenishment;
    }

    public int getBankRating() {
        return bankRating;
    }

    public String getDeposinName() {
        return deposinName;
    }

    public String getBankName() {

        return bankName;
    }

}
