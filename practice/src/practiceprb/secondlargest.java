package practiceprb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(7);
		System.out.println(list);
		
		Collections.sort(list);
		
		Iterator iter=list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		int large=list.get(list.size()-1);
		System.out.println("largest element is:"+large);
		int seclarge=list.get(list.size()-2);
		System.out.println("largest element is:"+seclarge);
		

	}

}
