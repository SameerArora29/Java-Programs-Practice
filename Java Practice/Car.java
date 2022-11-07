class Car extends Vehicle{
    int numgears;
    public void print() {
        super.print();
        System.out.println("Car numgears:" + numgears);
    }
}