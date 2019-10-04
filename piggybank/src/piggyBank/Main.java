package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    static ArrayList<Coin> piggyBank = new ArrayList<Coin>(); //Dollars can be coins too...
    static double myValue = 0;

    static void subtract(double amount) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        System.out.println();
        System.out.println("************************");
        System.out.println("SUBTRACTING " + fp.format(amount));
        System.out.println("************************");
        System.out.println();
        //Check if trying to remove more than total value...
        if (amount > myValue) {
            System.out.println("You do not have that much in your Piggy Bank");
        } else {
            //STEPS:
            //filter down the list of largest to smallest denominations
            //if bank has at least the amount of that denomination and has at least one of that coin, subtract 1, deduct from amount, and repeat.
            //If bank has less than the amount of that denomination, move onto the next largest denomination
            //if bank has at least the amount of a denomination, but no currency of that size, move onto the next denomination
            //When amount == 0, break;

            //while amount > 1
            amount = Math.round(amount * 100.0) / 100.0;
            while (amount >= 1) {
                int count = 0;
                for (Coin c : piggyBank) {
                    if (c instanceof Dollar && c.getTotal() >= 1 && amount >= 1) {
                        c.removeCoin(1);
                        amount -= 1;
                        count++;
                        break; //start while loop over to check if amount is still >= 1
                    }

                }
                if (count == 0) //If no coins of this denomination were found.. Break out of while loop and continue to next denomination
                {
                    break;
                } else { //Otherwise, reset count and start while loop over
                    count = 0;
                }
            }
            amount = Math.round(amount * 100.0) / 100.0;
            while (amount >= 0.25) {
                int count = 0;

                for (Coin c : piggyBank) {
                    if (c instanceof Quarter && c.getTotal() >= 0.25 && amount >= 0.25) {
                        c.removeCoin(1);
                        amount -= 0.25;
                        count++;
                        break; //start while loop over to check if amount is still >= 1
                    }


                }
                if (count == 0) //If no coins of this denomination were found.. Break out of while loop and continue to next denomination
                {
                    break;
                } else { //Otherwise, reset count and start while loop over
                    count = 0;
                }
            }
            amount = Math.round(amount * 100.0) / 100.0;
            while (amount >= 0.1) {
                int count = 0;
                for (Coin c : piggyBank) {
                    if (c instanceof Dime && c.getTotal() >= 0.1 && amount >= 0.1) {
                        c.removeCoin(1);
                        amount -= 0.1;
                        count++;
                        break; //start while loop over to check if amount is still >= 1
                    }
                }
                if (count == 0) //If no coins of this denomination were found.. Break out of while loop and continue to next denomination
                {
                    break;
                } else { //Otherwise, reset count and start while loop over
                    count = 0;
                }
            }
            amount = Math.round(amount * 100.0) / 100.0;

            while (amount >= 0.05) {

                int count = 0;
                for (Coin c : piggyBank) {
                    if (c instanceof Nickel && c.getTotal() >= 0.05 && amount >= 0.05) {
                        c.removeCoin(1);
                        amount -= 0.05;
                        count++;
                        break; //start while loop over to check if amount is still >= 1
                    }
                }
                if (count == 0) //If no coins of this denomination were found.. Break out of while loop and continue to next denomination
                {
                    break;
                } else { //Otherwise, reset count and start while loop over
                    count = 0;
                }
            }
            amount = Math.round(amount * 100.0) / 100.0;

            while (amount >= 0.01) {

                int count = 0;
                for (Coin c : piggyBank) {
                    if (c instanceof Penny && c.getTotal() >= 0.01 && amount >= 0.01) {
                        c.removeCoin(1);
                        amount -= 0.01;
                        count++;
                        break; //start while loop over to check if amount is still >= 1
                    }
                }
                if (count == 0) //If no coins of this denomination were found.. Break out of while loop and continue to next denomination
                {
                    break;
                } else { //Otherwise, reset count and start while loop over
                    count = 0;
                }
            }
        }
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


        for (Coin c : piggyBank) {
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

        myValue = 0;
        for (Coin c : piggyBank) {
            if (c.getTotal() > 0) {
                System.out.println(c.getCount());
            }

            myValue += c.getTotal();
        }
        System.out.println();
        System.out.println("****************************");
        System.out.println("The piggy bank holds " + fp.format(myValue));
        System.out.println("****************************");
    }
}
