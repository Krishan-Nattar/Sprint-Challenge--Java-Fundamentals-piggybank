package piggyBank;

public class Dollar implements Coin { //These are dollar coins!
    private int count;
    private double value; //Needs to be in currency format?

    public Dollar() //If you initialize without a count....
    {
        //Should default to one coin being added
        this.count = 1;
        this.value = 1;
    }

    public Dollar(int count) //If you initialize without a count....
    {
        //Should default to one coin being added
        this.count = count;
        this.value = 1;
    }

    @Override
    public void removeCoin()
    {
        //finish this later
    }


    @Override
    public String getCount() {
        if (this.count ==1) {
            return "$" + this.count;
        } else {
            return "$" + this.count; //Plurals
        }
    }

    @Override
    public Double getTotal() {
        return this.count * this.value;
    }
}
