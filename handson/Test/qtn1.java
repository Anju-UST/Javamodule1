import java.util.*;

class qtn1{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter no:");
int n=sc.nextInt();
int rem=0;
int d=0;
int temp=n;

while(temp>0){
d=temp%10;
rem+=Math.pow(d,3);
temp=temp/10;
}

if(rem==n)
	System.out.println("armstong");
else
	System.out.println(" not armstong");

}
}