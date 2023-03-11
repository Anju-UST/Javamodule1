package userdefinedobjects;
import java.util.*;

public class TestHashMap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stubEmployee emp1=new Employee("john doe", "male",24, 101 , "Reserach", 15000);
	
		Employee emp1=new Employee("john doe", "male",24, 101 , "Reserach", 15000);
		Employee emp2=new Employee("james doe", "male",44, 102 , "operations", 16000);
		Employee emp3=new Employee("john doe", "male",26, 103 , "Accounting", 10000);
		Employee emp4=new Employee("jene doe", "female",44, 104 , "sales", 115000);
		Employee emp5=new Employee("john doe", "male",24, 101 , "Reserach", 15000);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		System.out.println(empList);
		System.out.println(empList.size());
		
		HashSet<Employee> empSet = new HashSet<Employee>();
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		System.out.println(empSet);
		System.out.println(empSet.size());
		
		TreeSet<Employee> empTreeSet=new TreeSet<>();
		empTreeSet.add(emp1);
		empTreeSet.add(emp2);
		empTreeSet.add(emp3);
		empTreeSet.add(emp4);
		empTreeSet.add(emp5);
		System.out.println(empTreeSet);
		System.out.println(empTreeSet.size());
		
		HashMap<String, Collection> empMap =new HashMap();
		empMap.put("empList", empList);
		empMap.put("empSet", empSet);
		empMap.put("empTreeSet", empTreeSet);
		System.out.println(empMap);
		
		Collection<Employee> list =empMap.get("empList");
		Iterator<Employee> iter =list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		Collection<Employee> set= empMap.get("empSet");
		iter =set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		Collection<Employee> tree= empMap.get("empTreeSet");
		iter =tree.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
	


