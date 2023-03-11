package Strings;

public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bytes[]= {65,66,67,68,69};
		String str=new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str="welcome to ust";
		bytes = str.getBytes();
		for(byte b: bytes) {
			System.out.println(b);
		}
			char chars[]= {'U', 'S','T',' ', 'G'};
			
			str=new String(chars);
			System.out.println(str);
		str.getChars(0, chars.length-1, chars, 0);
		for(char c:chars) {
			System.out.println(c);
		}
		
		String string =new String("she sell sea shells-on the sea shore");
		int counter=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='s')
				counter++;
		}
		System.out.println("count:"+counter);//7
		
		String words[]=string.split("-"); //internally splitting string based on space and storing into array then taking the length of that array
		//she sell sea shells
		//on the sea shore      if[.]as separator put square bracket
		System.out.println(words.length);//8
		for(String w:words) {
			System.out.println(w); //print words
		}
		String string1=new String("cartoon");
		System.out.println(string1.startsWith("car"));
		System.out.println(string.endsWith("toon"));
		
		int apos= string1.indexOf('a');
		int tpos=string1.indexOf('t');
		
		String string2=string1.substring(apos, tpos+1);
		System.out.println(string2);
		string1=string2.substring(tpos);
		System.out.println(string2);
		
		string=new String("madamdam");
		
		int dpos=string.lastIndexOf('d');
		System.out.println("pos :"+dpos);//5
		string2=string.substring(dpos,string.length());
		System.out.println(string2);//dam
		
		String email=new String("aneeta.roy@ust.com");
		int cpos=email.lastIndexOf('.');//14
		
		System.out.println(cpos);
		String stri=email.substring(cpos+1,email.length());
		System.out.println(stri);//com
		
		String str1=new String("welcome");
		String str2=new String("welCOME");//if same 0
		
		boolean result =str1.equals(str2);
		System.out.println(result);
		
		int val=str2.compareTo(str1);
		System.out.println(val);
		
		string ="Diehard";
		System.out.println(string.toLowerCase());
		System.out.println(string);
		System.out.println(string.toUpperCase());
		System.out.println(string);//they are immutable ie cannot append or prepend
		
	
		string="16-11-477/6/A/3 Hyderabad 500036";
		int len=string.length();
		char ch;
		int count=0,flag=0,l=0,u=0,w=0,n=0;
		for(int i=0;i<len;i++)
		{
			ch=string.charAt(i);
			if(Character.isDigit(ch)==true) 
				count++;
			
			else if(Character.isLowerCase(ch)==true)
				l++;
			else if(Character.isUpperCase(ch)==true)
				u++;
			else if(Character.isWhitespace(ch)==true)
				w++;
			else 
				n++;
				
			
		}
		flag=l+u;
		System.out.println("count of digits:" +count );
		System.out.println("count of Alphabets:" +flag );
		System.out.println("count of lower:" +l );
		System.out.println("count of upper:" +u );
		System.out.println("count of space:" +w );
		System.out.println("count of symbol:" +n );
	}
	}



