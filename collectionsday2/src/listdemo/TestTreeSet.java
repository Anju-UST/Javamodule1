package listdemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> bookSet= new TreeSet<>();
		bookSet.add("java in nutshell");
		bookSet.add("java complete reference");
		bookSet.add("thinking in java");
		bookSet.add("java in 21 days");
		bookSet.add("java for dummys");
		bookSet.add(null);//treeset doesnot allow null element
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("java in nutshell"));
		
		bookSet.add("thinking in java");
		System.out.println(bookSet.size());
		
		for(String book :bookSet) {
			System.out.println(book);
		}
		
		Iterator <String> iter =bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
