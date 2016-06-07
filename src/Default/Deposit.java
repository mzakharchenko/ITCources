package Default;
import java.util.Comparator;



public class Deposit {
    String bankName;
    int bankRating;
    String deposinName;
    private boolean earlyDissolution;
    private double term; //in months
    private double percent; //in a year
    private int minSum;
    private boolean monthlyReplenishment;
    private double sum;



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
    public static Comparator <Deposit> sumOfDeposit = new Comparator <Deposit>() {
    	public int compare(Deposit d1, Deposit d2) {
    		double depositSum1 = d1.getSum();
    		double depositSum2 = d2.getSum();
    		return (int)(depositSum2)-(int)(depositSum1);
    		
    	}
    };
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


    
    public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
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
