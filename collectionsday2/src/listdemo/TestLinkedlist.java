package listdemo;
import java.util.LinkedList;
import java.util.*;

import javax.lang.model.element.Element;
import javax.swing.text.html.HTMLDocument.Iterator;

public class TestLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();//<>for type safety
		list.add("marker");
		list.add("pencil");
		list.add("book");
		list.add("eraser");
		list.add("sharpner");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		list.add(2, "sticky notes");
		System.out.println(list);
		
		java.util.Iterator<String> iter = list.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		ListIterator listIter = list.listIterator();//ascending printing
		while(listIter.hasNext()) {
			//System.out.println(listIter.next());
			String element= (String) listIter.next();
			if(element.equals("pencil")) {
				listIter.remove();
		}
		
		}
		System.out.println(list);
		
		
	}

}
