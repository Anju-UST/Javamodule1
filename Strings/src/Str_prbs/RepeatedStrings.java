package Str_prbs;

import java.util.ArrayList;
import java.util.HashSet;

public class RepeatedStrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Angelin Ammu Ammu Alex Alex";
		String t=s.toLowerCase();
		String p[]=t.split(" ");
		
        ArrayList<String> sc=new ArrayList<String>();

	for(String f:p) {
		sc.add(f);
	}
	System.out.println(sc);
	
	HashSet <String> hn=new HashSet<String>();
	
	for(String fs:sc) {
		hn.add(fs);
	}
	System.out.println(hn);
	 ArrayList<String> sc1=new ArrayList<String>(hn);
	for(int i=hn.size()-1;i>=0;i--) {
		
		System.out.println(sc1.get(i));
	}
	
	
	
	
	}
	
	
	
}
