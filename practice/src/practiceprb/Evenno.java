package practiceprb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//Write a Java program to remove all even numbers from an ArrayList of integers.
public class Evenno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(2);
		hset.add(3);
		hset.add(46);
		hset.add(35);
		hset.add(56);
		hset.add(64);
		hset.add(98);
		hset.add(77);
		System.out.println(hset);
		List<Integer> list = new ArrayList<Integer>(hset);
		  
		for(int i=0;i<list.size();i++) {
			if( list.get(i)%2==0)
				list.remove(i);
		}
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
	}

}
