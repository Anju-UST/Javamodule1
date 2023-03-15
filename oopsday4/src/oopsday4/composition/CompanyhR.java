package oopsday4.composition;

public class CompanyhR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address resAdd= new Address("31","mannath" , "Worli","munbai",40023);
		Address comAdd = new Address("32", "Antela", "Bandra","mumbai", 30032);
		
		Employee emp1=new Employee("john doe", "male",24, 101 , "Reserach", 15000, resAdd,comAdd);
		Employee emp2=new Employee("james doe", "male",44, 102 , "operations", 16000,resAdd,comAdd);
		Employee emp3=new Employee("john doe", "male",26, 103 , "Accounting", 10000,resAdd,comAdd);
		Employee emp4=new Employee("jene doe", "female",44, 104 , "sales", 115000,resAdd,comAdd);
		Employee emp5=new Employee("john doe", "male",24, 101 , "Reserach", 15000,resAdd,comAdd);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		
		if(emp1.equals(emp5)) {
			System.out.println("objects same");
		}
		else
				System.out.println("not");
		
	}

}
