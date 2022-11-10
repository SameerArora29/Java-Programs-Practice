public class Tailored extends Clothing {
private double fee = 0.9;

public double getfee() {
    return fee;
}

public double getprice() {
    return super.getprice() + getfee();
}

}