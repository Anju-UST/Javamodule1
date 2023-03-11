package listdemo;

public class Setbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1234;
		String str=i+"";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb);
		StringBuilder rev=sb.reverse();
		System.out.println(sb);
		boolean result=str.equals(sb.toString());
		System.out.println(result);

	}

}
