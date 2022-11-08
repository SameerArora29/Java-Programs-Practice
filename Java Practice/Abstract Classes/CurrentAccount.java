public class CurrentAccount extends Account{
    public int CalculateInterest() {
        int principal=1000,rate=6,time=1,SI;
        SI = principal*rate*time;
        return SI;
    }
}