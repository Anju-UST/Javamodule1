package creationalpattern.singleton;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con1=Connection.getConnection();
		Connection con2=Connection.getConnection();// if we put in loop once object is created then method is called 10 times
		//comparing hashcode to check whether its a singleton
		if(con1.equals(con2))
			System.out.println("yes");
		if(con1.hashCode()==con2.hashCode()) {
			System.out.println("singleton");
		}
		else
			System.out.println("not singleton");
	}


	}

