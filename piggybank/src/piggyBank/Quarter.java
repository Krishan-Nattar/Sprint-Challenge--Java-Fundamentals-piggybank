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

    public Quarter(int count) //If you initialize without a count....
    {
        //Should default to one coin being added
        this.count = count;
        this.value = 0.25;
    }

    @Override
    public void removeCoin(int count)
    {
        if(count <= this.count)
        {
            this.count -= count;
        }
    }


    @Override
    public String getCount() {
        if (this.count ==1) {
            return this.count + " Quarter";
        } else {
            return this.count + " Quarters"; //Plurals
        }
    }

    @Override
    public Double getTotal() {
        return this.count * this.value;
    }
}
