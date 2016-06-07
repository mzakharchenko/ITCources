import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
    private ArrayList<Deposit> deposits = new ArrayList<>();

    public Logic () {
        this.depositAutomaticCreation();
        this.introductionChoice();
    }

    public void depositAutomaticCreation () {
        deposits.add(new Deposit("PrivatBank", 4, "Standart", 500, 1, 19, true, true));
        deposits.add(new Deposit("PrivatBank", 4, "Standart", 500, 3, 20, true, true));
        deposits.add(new Deposit("PrivatBank", 4, "Standart", 500, 6, 21, true, true));
        deposits.add(new Deposit("PrivatBank", 4, "Standart", 500, 12, 22, true, true));

        deposits.add(new Deposit("OschadBank", 1, "Classic", 500, 0.25, 16.5, false, false));
        deposits.add(new Deposit("OschadBank", 1, "Classic", 500, 0.5, 17, false, false));
        deposits.add(new Deposit("OschadBank", 1, "Classic", 500, 1, 17.25, false, false));
        deposits.add(new Deposit("OschadBank", 1, "Classic", 500, 3, 17.75, false, false));
        deposits.add(new Deposit("OschadBank", 1, "Classic", 500, 6, 18, false, false));
        deposits.add(new Deposit("OschadBank", 1, "Classic", 500, 12, 18.25, false, false));
        deposits.add(new Deposit("OschadBank", 1, "Classic", 500, 18, 18.50, false, false));
        deposits.add(new Deposit("OschadBank", 1, "Classic", 500, 36, 18.50, false, false));

        deposits.add(new Deposit("Aval", 2, "Classic", 500, 1, 9.75, false, true));
        deposits.add(new Deposit("Aval", 2, "Classic", 500, 2, 9.75, false, true));
        deposits.add(new Deposit("Aval", 2, "Classic", 500, 3, 13.25, false, true));
        deposits.add(new Deposit("Aval", 2, "Classic", 500, 6, 14.75, false, true));
        deposits.add(new Deposit("Aval", 2, "Classic", 500, 12, 15.25, false, true));

        deposits.add(new Deposit("Unicredit", 3, "Capital", 500, 3, 20.50, false, true));
        deposits.add(new Deposit("Unicredit", 3, "Capital", 500, 6, 20.75, false, true));
        deposits.add(new Deposit("Unicredit", 3, "Capital", 500, 12, 21, false, true));
        deposits.add(new Deposit("Unicredit", 3, "Capital", 500, 24, 19, false, true));
        deposits.add(new Deposit("Unicredit", 3, "Capital", 500, 60, 14.75, false, true));
        deposits.add(new Deposit("Unicredit", 3, "Capital", 500, 120, 10.75, false, true));
    }

    public void finalSum () {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sum you want to invest");
        double investment = in.nextDouble();
        System.out.println("Enter a period of deposit");
        double period = in.nextDouble();
        double sum=0;
        double percents=0;
        for (Deposit i: this.getDeposits()) {
            if (period>=i.getTerm()) {
                percents=investment*(period*(i.getPercent()/12/100));
                sum=investment+percents;
                System.out.println("Deposit in " + i.bankName + " (rating " + i.bankRating + "). Deposit name - " + i.getDeposinName() +
                        ". Finish sum " + Math.round(sum) + ". percents = " + Math.round(percents));
            }


        }

    }
    public void introductionChoice () {
        System.out.println ("What do you want to do?");
        System.out.println ("1. Add new deposit");
        System.out.println ("2. Select the deposit");
        System.out.println ("3.EXIT");
        System.out.println ("Type number of your answer");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();
        if (choice.equals("1")) {
            System.out.println ("1. Add new deposit");
        }

        if (choice.equals("2")) {
            this.finalSum();
        }

        else {
            System.out.println ("3.EXIT");
        }
    }
    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }
    public void sortingBy (String criterion, int quantity) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sum you want to invest");
        double investment = in.nextDouble();
        System.out.println("Enter a period of deposit");
        double period = in.nextDouble();
        double sum=0;
        double percents=0;
        ArrayList<Double> resultList= new ArrayList<>();
        ArrayList<Deposit> result = new ArrayList<>();
        double maxSum=0;
        Deposit max=this.getDeposits().get(0);
        Deposit temp;
        for (int i = 0; i<this.getDeposits().size(); i++) {
            if (period>=this.getDeposits().get(i).getTerm()&&investment>=this.getDeposits().get(i).getMinSum()) {
                percents=investment*(period*(this.getDeposits().get(i).getPercent()/12/100));
                sum=investment+percents;
                resultList.add(sum);
                result.add(this.getDeposits().get(i));
            }


        }


    }
}
