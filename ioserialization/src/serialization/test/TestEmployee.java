package serialization.test;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101, "John doe",4000,"nono");
		
		FileOutputStream fos = new FileOutputStream("emp.dat");
		ObjectOutputStream oos= new ObjectOutputStream(fos);//for write into file
		oos.writeObject(emp);
	}

}
