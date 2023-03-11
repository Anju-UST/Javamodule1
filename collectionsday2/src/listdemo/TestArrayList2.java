package listdemo;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors =new ArrayList<String>();
		//colors.add(new Object());
		
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		colors.add("yellow");
		colors.add("orange");
		colors.add(null);
		
		System.out.println(colors);
		System.out.println(colors.size());
		
		String str=colors.get(3);
		System.out.println(str);//yellow
	}

}
