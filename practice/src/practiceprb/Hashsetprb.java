package practiceprb;

import java.util.HashSet;

public class Hashsetprb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to compare two hash set
		HashSet<String> h_set = new HashSet<String>();
		     // use add() method to add values in the hash set
		          h_set.add("Red");
		          h_set.add("Green");
		          h_set.add("Black");
		          h_set.add("White");

		          HashSet<String>h_set2 = new HashSet<String>();
		          h_set2.add("Red");
		          h_set2.add("Pink");
		          h_set2.add("Black");
		          h_set2.add("Orange");
		          //comparison output in hash set
		         
		         for (String element : h_set){
		             System.out.println(h_set2.contains(element) ? "Yes" : "No");
		          }      



	}

}
