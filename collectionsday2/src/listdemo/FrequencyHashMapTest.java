package listdemo;

import java.util.HashMap;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String str="welcome to the world of java. The root interface in the collection hierarchy. A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered. The JDK does not provide any direct implementations of this interface: it provides implementations of more specific subinterfaces like Set and List. This interface is typically used to pass collections around and manipulate them where maximum generality is desired.Bags or multisets unordered collections that may contain duplicate elements should implement this interface directly.All general purpose Collection implementation classes which typically implement Collection indirectly through one of its subinterfaces should provide two standard constructors: a void no arguments constructor, which creates an empty collection, and a constructor with a single argument of type Collectionring";
		String[] words = str.split(" ");
		System.out.println(words.length);
	
		HashMap<String, Integer> data =new HashMap();
		
		for (String word : words) {
			 
			Integer count = data.get(word);
 
			/*
			 * if (count == null)
			 * 
			 * data.put(word, 1); else data.put(word, count+1);
			 */            
			if(count!=null)
            	data.put(word, ++count);
            else
            	
            	data.put(word, 1);
			}
		System.out.println(data);
	}
	
}
