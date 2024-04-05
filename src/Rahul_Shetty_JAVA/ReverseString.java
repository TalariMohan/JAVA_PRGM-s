package Rahul_Shetty_JAVA;

public class ReverseString {

	public static void main(String[] args) {
		String S="madam";
		String  T="";
		for(int i=S.length()-1;i>=0;i--) {
			//System.out.println(S.charAt(i));
			T=T+S.charAt(i);
		}
		System.out.println(T);
		if(S.equals(T)) {                       //
			
			System.out.println("PALINDROM");
		}
		else {
		System.out.println("Not PALINDROM");
	}

}}
