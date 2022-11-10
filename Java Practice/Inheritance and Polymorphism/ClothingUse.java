public class ClothingUse {
    public static void main(String args[]) {
        Tailored jacket = new Tailored();
        // jacket.getprice();
        System.out.println(jacket.getprice());

        Clothing[] items = new Clothing[2];
        items[0]= new Tailored();
        items[1] = new Standard();

        for(Clothing i: items) {
            System.out.println(i.getprice());
        }
    }
    
}