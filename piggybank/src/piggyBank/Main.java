package piggyBank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Currency;

public class Main {

    static ArrayList<Currency> piggyBank = new ArrayList<>();

    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
	// write your code here
        int myValue = 0;
        System.out.println("The piggy bank holds " + fp.format(myValue));
    }
}
