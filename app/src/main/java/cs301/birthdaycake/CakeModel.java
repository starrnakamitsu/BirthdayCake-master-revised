package cs301.birthdaycake;

public class CakeModel {

    private boolean lit = true;
    private int numCandles = 2;
    private boolean frosting = true;
    private boolean candles = true;

    public void setLit(boolean lit){
        this.lit = lit;
    }
    public boolean getLit() {
        return lit;
    }
    public void setCandles(boolean candles){
        this.candles = candles;
    }

    public boolean getCandles(){
        return candles;
    }

    public void setNumCandles(int numCandles){
        this.numCandles = numCandles;
    }

    public int getNumCandles(){
        return numCandles;
    }


}
