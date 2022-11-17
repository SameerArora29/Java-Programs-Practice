import java.util.*;
class Stringpractice {
    public static void main(String args[]) {
        char ch = 'f';
		char ch1 = 'a';
		int a = 65;
//		char ch2 = s.next().charAt(0);
		String str = "abcd";
		
		String str1="efgh";
//		System.out.println(str.concat(str1));
		
//		System.out.println(str1);
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		String str3 = new String("hgf");
		StringBuffer str2 = new StringBuffer("abc");
		str2.setCharAt(0,'g');
		str2.reverse();
		str2.delete(0, 1);
        System.out.println(str2);
		str2.insert(1,"java");
		System.out.println(str2);
		StringBuilder str4 = new StringBuilder("hii");
		System.out.println(str4);
		String name = "abcd";
		name = "1234";
    }
}