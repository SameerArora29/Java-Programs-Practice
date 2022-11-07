public abstract class Vehicle1 {
    String color;
    int numtyres;

   public abstract boolean isMotorized();

    public void print() {
        System.out.println("Vehicle color:" + color);
        System.out.println("Vehicle numtyres:" + numtyres);
    }
}