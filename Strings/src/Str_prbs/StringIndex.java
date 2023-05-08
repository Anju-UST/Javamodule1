package Str_prbs;

import java.util.Scanner;

//i love java and python
// o/p: python and java love i 
public class StringIndex {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		System.out.println("String:");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		//String str="i love java and python";
		String s[]= str.split("\\s");
		for( int i=s.length-1;i>=0;i--) {
			System.out.println(s[i]+" ");
		}

	}

}
