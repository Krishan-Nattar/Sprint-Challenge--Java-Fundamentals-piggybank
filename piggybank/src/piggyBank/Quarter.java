package piggyBank;

public class Quarter implements Coin {
    private int count;
    private double value; //Needs to be in currency format?

    public Quarter() //If you initialize without a count....
    {
        //Should default to one coin being added
        this.count = 1;
        this.value = 0.25;
    }

    @Override
    public void removeCoin()
    {
        //finish this later
    }


    @Override
    public String getCount() {
        if (this.count ==1) {
            return this.count + "Quarter"; //Should print "1 Quarter" ?
        } else {
            return this.count + "Quarters"; //Plurals
        }
    }

    @Override
    public Double getTotal() {
        return this.count * this.value;
    }
}
