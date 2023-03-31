package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList flowers =new ArrayList();
		flowers.add(new Integer("1"));
		flowers.add(new java.util.Date());
		flowers.add(new java.util.Scanner(System.in));
		flowers.add(new Double ("10.10"));
		flowers.add("tulip");
		flowers.add("rose");
		flowers.add("jasmine");
		flowers.add("lily");
		flowers.add("cosmos");
		
		
		  System.out.println(flowers.contains("lily"));//true
		  flowers.add(2,"sunflower");
		 
		  for(Object obj:flowers) { System.out.println(obj);
		  
		  } flowers.remove(2); System.out.println(flowers);
		 
		  Iterator iter =flowers.iterator();
		 
		  while(iter.hasNext()) { System.out.println(iter.next()); }
		  
		  for(int i=0;i<flowers.size();i++) { System.out.println(flowers.get(i)); }
		 
		 //String str=(String)flowers.get(5);
		 	Object obj = flowers.get(0);
		if(obj instanceof Integer) {
			Integer in=(Integer) obj;
			System.out.println(in.MIN_VALUE);
		}
		else if(obj instanceof Double) {
			Double d =(Double) obj;
			System.out.println(d.MAX_VALUE);
		}
		else if(obj instanceof String) {
			String str=(String) obj;
			System.out.println(str.toUpperCase());
		}
		
	}

}
