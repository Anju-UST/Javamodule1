package Exceptionday6;
import java.sql.*;

public class ExceptionDemo4 {
	static void method () throws SQLException{
		throw new SQLException("connection failed");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{ method();
		
			
		}catch (SQLException e)
		{
			printStackTrace();
			
		}

	
		
	}


	private static void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
}
