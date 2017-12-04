package vending_machine;

public class MachineModel {
    private int oneCoin;
    private int fiveCon;
    private int tenCoin;
    private int twentyfiveCoin;
    private int coke25;
    private int pepsi35;
    private int soda45;

    public MachineModel() {
    }

    public MachineModel(int oneCoin, int fiveCon, int tenCoin, int twentyfiveCoin) {
        this.oneCoin = oneCoin;
        this.fiveCon = fiveCon;
        this.tenCoin = tenCoin;
        this.twentyfiveCoin = twentyfiveCoin;
    }

    public MachineModel(int coke25, int pepsi35, int soda45) {
        this.coke25 = coke25;
        this.pepsi35 = pepsi35;
        this.soda45 = soda45;
    }

    public MachineModel(int oneCoin, int fiveCon, int tenCoin, int twentyfiveCoin, int coke25, int pepsi35, int soda45) {
        this.oneCoin = oneCoin;
        this.fiveCon = fiveCon;
        this.tenCoin = tenCoin;
        this.twentyfiveCoin = twentyfiveCoin;
        this.coke25 = coke25;
        this.pepsi35 = pepsi35;
        this.soda45 = soda45;
    }

    public int getOneCoin() {
        return oneCoin;
    }

    public void setOneCoin(int oneCoin) {
        this.oneCoin = oneCoin;
    }

    public int getFiveCon() {
        return fiveCon;
    }

    public void setFiveCon(int fiveCon) {
        this.fiveCon = fiveCon;
    }

    public int getTenCoin() {
        return tenCoin;
    }

    public void setTenCoin(int tenCoin) {
        this.tenCoin = tenCoin;
    }

    public int getTwentyfiveCoin() {
        return twentyfiveCoin;
    }

    public void setTwentyfiveCoin(int twentyfiveCoin) {
        this.twentyfiveCoin = twentyfiveCoin;
    }

    public int getCoke25() {
        return coke25;
    }

    public void setCoke25(int coke25) {
        this.coke25 = coke25;
    }

    public int getPepsi35() {
        return pepsi35;
    }

    public void setPepsi35(int pepsi35) {
        this.pepsi35 = pepsi35;
    }

    public int getSoda45() {
        return soda45;
    }

    public void setSoda45(int soda45) {
        this.soda45 = soda45;
    }
}
