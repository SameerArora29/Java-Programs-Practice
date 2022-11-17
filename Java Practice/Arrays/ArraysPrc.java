import java.util.*;
public class ArraysPrc {
    public static int[] takeInput() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of array :");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Array Elements :");
		for(int i=0;i<size;i++) {
			a[i]= s.nextInt();
		}
		return a;
	}
	public static void PrintArray(int[] arr) {
		int len=arr.length;
		System.out.println("Printed Array");
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i] + " ");
		}
	} 
    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of testcases :");
		int n=s.nextInt();
		
		while(n!=0) {
			//int size=s.nextInt();
			int arr[]=takeInput();
			PrintArray(arr);
			n--;
		}
		
	}
}