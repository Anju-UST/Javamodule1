package Str_prbs;

public class Common_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list[]= {"cardriver","racecar","car"};
		   String temp=list[0];
		   for(int i=1;i<list.length;i++)
		   {
			     while(list[i].contains(temp)==false) {
			    	
				   temp=temp.substring(0, temp.length()-1);
				   
			   }
		    
		   }
		   System.out.println(temp);
			
	}
//	 public String longestCommonPrefix(String[] strs) {
//	        String prefix=strs[0];
//	        for(int i=1;i<strs.length;i++){
//	            while(strs[i].indexOf(prefix)!=0){// returning -1 so enter loop
//	                prefix=prefix.substring(0,prefix.length() -1);
//	            }
//	        }
//	        return prefix;
//	        
//	        }

}
