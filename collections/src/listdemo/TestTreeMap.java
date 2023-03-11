package listdemo;

import java.util.*;

public class TestTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> countryCurr = new TreeMap<>();
		
		countryCurr.put("IND", "Rupee");
		countryCurr.put("usa", "dollar");
		countryCurr.put("uk", "pound");
		//countryCurr.put(null, null); not allowed
		
		System.out.println(countryCurr);
		System.out.println(countryCurr.get("IND"));
		countryCurr.put("IND", "Rupee");
		
		System.out.println(countryCurr);
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("uk"));
		System.out.println(countryCurr.containsValue("dollar"));
		
		//hashmap has 3 views 
		//1.key view
		
		Set<String>	keys =countryCurr.keySet();
		for(String key :keys) {
			System.out.println(key);
		}
		
		//2.values view
		Collection<String> values = countryCurr.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		//3. key values together - entryset
		Set<java.util.Map.Entry<String,String>> entries = countryCurr.entrySet();
		for(java.util.Map.Entry<String, String> entry : entries) {
			System.out.println(entry); // order is there ind=rupee, uk=pound, usa=dollar
		}
		
	}

}
