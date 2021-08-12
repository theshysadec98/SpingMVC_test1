package Models;

public class TransferMoney {
    private double Transfer;

    public TransferMoney() {
    }

    public TransferMoney(double transfer) {
        Transfer = transfer;
    }

    public double getTransfer() {
        return Transfer;
    }

    public void setTransfer(double transfer) {
        Transfer = transfer;
    }

    public double VN_To_USD(){
        return  this.Transfer/20000;
    }
    public double USD_To_VN(){
        return this.Transfer*20000;
    }
}
