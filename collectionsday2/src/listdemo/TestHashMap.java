package listdemo;

import java.util.*;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> countryCurr = new HashMap<>();
		
		countryCurr.put("IND", "Rupee");
		countryCurr.put("usa", "dollar");
		countryCurr.put("uk", "pound");
		countryCurr.put(null, null);
		
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
			System.out.println(entry);  //no order usa=dollar, uk=pound ind=rupee
		}
		
	}

}
