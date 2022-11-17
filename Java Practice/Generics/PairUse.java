public class PairUse {
	
	public static void main(String args[]) {
		
		Pair p = new Pair(1,2);
		
		
		p.setfirst(2);
		
		System.out.println(p.getfirst());
		
		PairAgain<String,Integer> p1 = new PairAgain<String,Integer>("abc",42);
		PairAgain<Character,Character> p2 = new PairAgain<>('a','b');

       System.out.println(p1.getfirst());
	   System.out.println(p1.getsecond());


    }
}