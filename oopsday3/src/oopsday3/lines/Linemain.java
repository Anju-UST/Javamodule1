package oopsday3.lines;

import java.util.Scanner;

public class Linemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the initial x coordinate:");
	int x1= sc.nextInt();
	System.out.println("enter the 2nd cordinate:");
	int y1= sc.nextInt();
	System.out.println("enter the final x cordinate:");
	int x2= sc.nextInt();

	
	
	Point p1=new Point(x1,y1);
	Point p2=new Point(x2,y1);
	
	Line d = new Line();
	d.drawline(p1, p2);
	
	
		

		

	}

}
