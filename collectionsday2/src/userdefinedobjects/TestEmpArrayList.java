package userdefinedobjects;
import java.util.*;


public class TestEmpArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1=new Employee("john doe", "male",24, 101 , "Reserach", 15000);
		Employee emp2=new Employee("james doe", "male",44, 102 , "operations", 16000);
		Employee emp3=new Employee("john doe", "male",26, 103 , "Accounting", 10000);
		Employee emp4=new Employee("jene doe", "female",44, 104 , "sales", 115000);
		Employee emp5=new Employee("john doe", "male",24, 101 , "Reserach", 15000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList);
		

	}

}
