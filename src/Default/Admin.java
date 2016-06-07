package Default;

import java.util.ArrayList;

public class Admin {
    private static final String LOGIN="admin";
    private static String PASSWORD="password";
    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getLOGIN() {
        return LOGIN;
    }
    public void depositAdd (ArrayList<Deposit> deposites, String bankName, int bankRating, String depositName, int minSum, double term, double percent, boolean earlyDissolution, boolean monthlyReplenishment) {
        //
        deposites.add(new Deposit(bankName, bankRating, depositName, minSum, term, percent, earlyDissolution, monthlyReplenishment));
    }

}
