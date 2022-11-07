public class VehicleUse2 {
    public static void main(String args[]) {
        
     Vehicle2 v= new Vehicle2();
         v.color = "Black";
         v.print();


       Car2 c = new Car2();
       c.modelno = 543;
       System.out.println(c.getmaxspeed());
       c.print();
    }
}