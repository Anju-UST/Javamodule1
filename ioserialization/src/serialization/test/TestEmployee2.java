package serialization.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class TestEmployee2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("D:\\USTCORE\\ioserialization\\emp.dat");
		ObjectInputStream ois =new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee ref=(Employee)obj;//object typecast to employee class
		System.out.println(ref);//Employee [empno=101, name=John doe, salary=4000.0]
		
	}

}
