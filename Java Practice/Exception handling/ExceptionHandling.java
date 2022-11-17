public class ExceptionHandling {

    public static int divide(int a,int b) throws DivideByZeroException{
		
		if(b==0) {
			throw new DivideByZeroException();
		}
		return a/b;
	}
	
	public static void main(String args[]) {
		
		
		try {
			divide(10,0);
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("DivideByZeroException Caught");
		}
		System.out.println("10");
		
	}
}
   

