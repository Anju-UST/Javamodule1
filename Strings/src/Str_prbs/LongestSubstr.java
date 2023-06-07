package Str_prbs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="allisgood";
		//char[] s=str.toCharArray();
		int count=0,max=0;
		Set<Character> sett=new HashSet<Character>();
		//ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(!sett.contains(str.charAt(j))) {
					sett.add(str.charAt(j));
					count++;
					max=Math.max(max, count);
					
				}
				else {
					count=0;
					sett.clear();
					break;
				}
			}
		}
		
		System.out.println("max:"+max);
		//System.out.println(list);

	}

}
