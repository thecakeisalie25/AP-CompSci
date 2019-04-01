package ch09.ex01;
        
public class MonetaryCoin extends Coin
{
    private int worth;

    public MonetaryCoin(int worth) {
        super();
        setWorth(worth);
    }

    /**
     * @return the worth
     */
    public int getWorth() {
        return worth;
    }

    /**
     * @param worth the worth to set
     */
    public void setWorth(int worth) {
        this.worth = worth;
    }
}