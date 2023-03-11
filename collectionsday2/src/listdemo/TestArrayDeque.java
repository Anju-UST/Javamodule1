package listdemo;
import java.util.*;
import java.util.ArrayDeque;

public class TestArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> queue=new ArrayDeque<>();
		
		queue.addLast("first");
		queue.addLast("second");	
		queue.addLast("third");
		queue.addLast("fourth");
		queue.addLast("fifth");
		
		System.out.println(queue);
		System.out.println(queue.size());
		
		String element=queue.peek();//queue.getFirst();
		System.out.println(queue.peek());
		//System.out.println(element);
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);// second 3rd 4th 5th ,,, removed first element
	
		Iterator<String> iter =queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
			
		}
	}

}
