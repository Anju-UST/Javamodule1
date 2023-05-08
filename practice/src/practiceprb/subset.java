package practiceprb;

import java.util.ArrayList;

public class subset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3};
int c=0,max=0;
int limit=(int)Math.pow(2, a.length);
//System.out.println(limit);	
ArrayList<String> list=new ArrayList<String>();
for(int i=0;i<limit;i++) {
	
	int temp=i;
	String s=" ";
	for(int j=a.length-1;j>=0;j--) {
		int r=temp%2;// to get 1 position 0%2 ==0 
		temp=temp/2;//0
		if(r==0) {
			s="-"+" "+s;
		}
		else
		{
			s=a[j]+" "+s;
			c++;
		}
	}
	if(max<=c) {
		max=c;
	}
	c=0;
	System.out.println(s);
	list.add(s);
}
System.out.println(list);
System.out.println(max);

	System.out.println(list.get(list.size()-1));

		
	}
}
