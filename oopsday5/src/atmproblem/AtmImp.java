package atmproblem;

import java.util.Scanner;

public class AtmImp implements AtmIface {
 AtmFunctions a=new AtmFunctions();
 Scanner sc=new Scanner(System.in);
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount : "); 
		a.setAmount(sc.nextInt());
		System.out.println("Enter the count of 500: ");
		a.setUfh(sc.nextInt());
		System.out.println("Enter the count of  100: ");
		a.setHcount(sc.nextInt());
		System.out.println("Enter the count of 50: ");
		a.setFycount(sc.nextInt());
		System.out.println("Enter the count of 20: ");
		a.setTycount(sc.nextInt());
		System.out.println("Enter the count of  10: ");
		a.setTcount(sc.nextInt());
		a.check();
	}
}
System.out.println("Enter the amount");
amt = sc.nextInt();
//System.out.println(amt);
//a.check();
   while(a.fhcount>0) {
  System.out.println("Enter the 500 count : ");
  a.setUfh(sc.nextInt());
  a.fhcount-=a.ufh;
  if(a.fhcount<0 ||a.fhcount<a.ufh) {
  System.out.println("Insufficient");
  a.ufh=0;
 
  }
  break;
  }

 while(a.hcount > a.uh&&a.getUfh()*500!=amt) {

System.out.println("Enter the 100 count : ");
a.setUh(sc.nextInt());
a.hcount-=a.uh;
if(a.hcount<0 ||a.hcount<a.uh) {
  System.out.println("Insufficient");
  a.uh=0;
 
}
break;
}
 
 while(a.fycount >a.ufy &&(a.getUfh()*500+a.getUh()*100!=amt)) {
  System.out.println("Enter the 50 count : ");
a.setUfy(sc.nextInt());
a.fycount-=a.ufy;
if(a.fycount<0 ||a.fycount<a.ufy) {
  System.out.println("Insufficient");
          a.ufy=0;
         
}
  break;
  }

 while(a.tycount >a.uty &&(a.getUfh()*500+a.getUh()*100+a.getUfy()*50!=amt)) {
System.out.println("Enter the 20 count : ");
a.setUty(sc.nextInt());
a.tycount-=a.uty;
if(a.tycount<0 ||a.tycount<a.uty) {
  System.out.println("Insufficient");
a.uty=0;

}
break;
}
 
 while(a.tcount >a.ut &&(a.getUfh()*500+a.getUh()*100+a.getUfy()*50+a.uty*20!=amt)) {
//if((a.getUfh()*500)+(a.getUh()*100)+(a.getUfy()*50)!=amt) {
System.out.println("Enter the 10 count : ");
a.setUt(sc.nextInt());
a.tcount-=a.ut;
if(a.tcount<0 ||a.tcount<a.ut) {
  System.out.println("Insufficient");
a.ut=0;

}
break;
 }
//a.check();


}

//public void balanceCurrency() {

//		int usum=0;
//		if(a.getUfh()>a.getFhcount()) {
//			System.out.println("insuffient ");
//			
//			}
//		else if(a.getUfh()<a.getFhcount()) {
//			a.fhcount=a.fhcount-a.ufh;
//			System.out.println(a.fhcount);
//			
//		}
//		else if(a.getUh()>a.getHcount()) {
//			System.out.println("insuffient ");
//			
//		}
//		else if(a.getUh()<a.getHcount()) {
//			a.hcount=a.hcount-a.uh;
//			System.out.println(a.hcount);
//			
//		}
//		else if(a.getUfy()>a.getFycount()) {
//			System.out.println("insuffient ");
//		}
//	}
//}*/