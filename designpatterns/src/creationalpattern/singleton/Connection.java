package creationalpattern.singleton;

public class Connection {
	static Connection con;
	
	private Connection() {
		// TODO Auto-generated constructor stub
	}
	public static Connection getConnection() {
		//method returning object
		if(con!=null)
			return con;
		else
			con=new Connection();
		return con;//instantiating the object and returning it
//		return new Connection();//not singleton
	}
		
}
