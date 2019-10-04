package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    static ArrayList<Coin> piggyBank = new ArrayList<Coin>(); //Dollars can be coins too...

    static void subtract(double amount)
    {
        System.out.println("YOU WANT TO REMOVE " + amount);
    }


    public static void main(String[] args) {
        System.out.println();
        System.out.println("*** PIGGYBANK SPRINT ***");
        System.out.println();
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        double myValue = 0;

        for(Coin c: piggyBank)
        {
            System.out.println(c.getCount());
            myValue += c.getTotal();
        }

        System.out.println();
        System.out.println("****************************");
        System.out.println("The piggy bank holds " + fp.format(myValue));
        System.out.println("****************************");

        //Subtract 1.50 from piggybank.
        //Cannot be through individual class...
        //needs a static/public method in Main?

        subtract(1.50);
    }
}
