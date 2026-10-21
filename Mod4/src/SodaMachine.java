//Create a data type SodaMachine that has methods insertCoin(),
// getChange(), buy(), etc. The program should be named SodaMachine.java
public class SodaMachine {
    private int coins = 0;
    private String[] sodas;
    private double[] cost;

    public void insertCoin(int coins) {
        this.coins += coins;
    }

    public int getChange() {
        return coins;
    }
    public String buy(int sodaNumb) {
        if(sodaNumb < 0 && sodaNumb > sodas.length){
            return "Please use a number that represents a soda.";
        }
        if(cost[sodaNumb]>getChange()){
            return "insufficient funds";
        }else{
            coins-=cost[sodaNumb];
            return sodas[sodaNumb];
        }
    }
}

