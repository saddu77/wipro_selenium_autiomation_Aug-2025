package javadbconnect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodb_two"; // DB URL 
		String uname = "root"; 
		String pwd = "admin";
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, uname,pwd); 
			String sql = "insert into users(username,password) values(?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, "jack");
			cs.setString(2, "123456");
			cs.execute();
			System.out.println("Record Inserted Successfully !!!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Load driver 
		 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
