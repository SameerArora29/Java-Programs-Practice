class Square implements CalArea {
    int side;

       public Square(int len) {
        side=len;
       }

       public void calarea() {
         System.out.println(side*side);
    }
}