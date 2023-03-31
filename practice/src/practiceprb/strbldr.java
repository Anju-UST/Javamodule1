package practiceprb;

public class strbldr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ant";
		String q="pq";
		StringBuilder sb=new StringBuilder(s);{
		//sb.append(q);
			sb.reverse();
			System.out.println(sb);}
			
			String t=s.toString();
			if(s.equals(t)) 
				System.out.println("yes");
			
				else
					System.out.println("no");
			

	}

}
