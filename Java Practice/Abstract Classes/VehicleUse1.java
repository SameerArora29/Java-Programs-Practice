class VehicleUse1 {
    public static void main(String args[]) {
        Car1 c= new Car1();
		c.color="red";
		c.numgears = 5;
		c.numtyres = 4;
        c.print();
        c.companyname = "BMW";
        c.getcompany();
        System.out.println(c.isMotorized());
    }
}