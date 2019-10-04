package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    static ArrayList<Coin> piggyBank = new ArrayList<Coin>(); //Dollars can be coins too...


    public static void main(String[] args) {
        System.out.println("*** STARTING PROGRAM ***");
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        
        int myValue = 0;
        System.out.println("The piggy bank holds " + fp.format(myValue));
    }
}
