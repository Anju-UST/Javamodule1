package practiceprb;

import java.util.ArrayList;
import java.util.Scanner;

//find the common elements between two ArrayLists of integers.
public class Commonelmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list1=new ArrayList<Integer>();
		ArrayList<Integer>list2=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter size:");
		int n=sc.nextInt();
		System.out.println("eneter elements:");
		for(int i=0;i<n;i++) {
			list1.add(sc.nextInt());
		}
		System.out.println(list1);
		
		list2.add(44);
		list2.add(6);
		list2.add(34);
		list2.add(3);
		list2.add(7);
		for(int i:list2) {
			System.out.println(i);
		}
		System.out.println("common elements are:");
//		for(int i:list1) {
//			System.out.println(list1.contains(list2.get(i)));
//		}
		list1.retainAll(list2);
		System.out.println(list1);
		
	}
}

