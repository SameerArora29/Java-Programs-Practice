class Circle implements CalArea {
    int radius;

  public Circle(int rad) {
    radius = rad;
  }

  public void calarea() {
    System.out.println(PI*radius*radius);
  }

}