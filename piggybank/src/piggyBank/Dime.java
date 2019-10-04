package piggyBank;

public class Dime implements Coin {
    private int count;
    private double value; //Needs to be in currency format?

    public Dime() //If you initialize without a count....
    {
        //Should default to one coin being added
        this.count = 1;
        this.value = 0.1;
    }

    public Dime(int count) //If you initialize without a count....
    {
        //Should default to one coin being added
        this.count = count;
        this.value = 0.1;
    }

    @Override
    public void removeCoin()
    {
        //finish this later
    }


    @Override
    public String getCount() {
        if (this.count ==1) {
            return this.count + " Dime"; //Should print "1 Quarter" ?
        } else {
            return this.count + " Dimes"; //Plurals
        }
    }

    @Override
    public Double getTotal() {
        return this.count * this.value;
    }
}
