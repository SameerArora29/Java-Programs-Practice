class Car2 extends Vehicle2 implements CarInterface {

    int modelno;

    public int getmaxspeed() {
        return 20;
    }

    public void getCompany(){
        System.out.println("BMW");
    }

   public void print() {
    System.out.println("Car Interface implementation");
    getCompany();
   }

}