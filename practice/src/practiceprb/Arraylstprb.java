package practiceprb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylstprb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<Integer>list2=new ArrayList<Integer>();
		
		list1.add("hi");
		list1.add("jk");
		list1.add("tr");
		System.out.println(list1);
		for(String s:list1) {
			System.out.println(s);
		}
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
		
		Iterator iter=list2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//list to  array
				int l=list2.size();
				int[] arr=new int[l];
				for(int i=0;i<l;i++) {
					arr[i]=list2.get(i);
				}
				for(int i=0;i<l;i++) {
					System.out.println(arr[i]);
				}
				//array to arraylist
				String[] cities= {"boston","italy"};
				ArrayList<String>list=new ArrayList<String>();
				Collections.addAll(list,cities);
				System.out.println(list);
				
				
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>list3=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list3.add(sc.nextInt());
		}
		System.out.println(list3);
		}
	
	
	}
