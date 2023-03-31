package practiceprb;

import java.util.Scanner;

public class splitprb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of persons:");
		int n= sc.nextInt();
		System.out.println("enter the amount:");
		int amt=sc.nextInt();
		int sum=0;
		int rem=0, bal=0;
		for(int i=0;i<n;i++) {
			System.out.println("person"+i);
			System.out.println("enter split:");
			int sp=sc.nextInt();
			sum=sum+sp;
		}
		if(sum==amt)
		System.out.println("success");
		else
			rem=amt-sum;
		System.out.println("rem="+rem);
	}
}
//			bal=rem/n;
//			for(int i=0;i<n;i++) {
//				System.out.println("split am");
//			}
		
//		public class Split {
//			public static void main() {
//				int sum=0;
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter the amount ");
//			int amount = sc.nextInt();
//			System.out.println("Enter the no.of people");
//			int p = sc.nextInt();
//			ArrayList<Integer> arr = new ArrayList<Integer>();
//			for(int i=0;i<=p;i++) {
//				System.out.println("Enter amount p"+i+"pay");
//				arr.add(sc.nextInt());	
//			}
//			System.out.println(arr);
//			for(int i:arr) {
//				 sum=sum+arr.get(i);
//				 if(sum==amount) {
//					 System.out.println("Success");
//				 }
//			}
//
//
//		
//		
//			
//		
//
//	}


