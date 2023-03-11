package Exceptionday6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program task begins");
		try {
			Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c=a/b;//point of exception System.out.println(c);
		System.out.println(c);
		 }catch(ArithmeticException e) { 
			  System.out.println("cannot / by zeo"); 
		}catch(InputMismatchException e) {
			System.out.println("invaid ip format");
		}
		 
		System.out.println("program completed task");
	}
	}


