package Str_prbs;

import java.util.Scanner;
//length of last word of string
public class Length0fLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		int l=0;
		String str= s.trim();
		for(int i=str.length()-1;i>=0;i--) {
		
			if(str.charAt(i)==' ')
				break;
			else
				l++;
		}
		System.out.println("LENGTH:"+l);
	}

}
