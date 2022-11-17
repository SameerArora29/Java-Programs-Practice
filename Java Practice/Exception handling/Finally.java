public class Finally {

     public static int Use() {
        try{
          int a=50;
          int b=2;
          int c = a/b;
          return c;

     }catch(Exception e) {
        System.out.println(e);
     }finally{
          System.out.println("Closing Connections....");
     }
     return -1;
     }

     public static void main(String args[]) {
        int k =Use();
        System.out.println(k);
     }

}