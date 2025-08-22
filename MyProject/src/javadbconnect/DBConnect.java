package javadbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodb_two"; // DB URL 
		String uname = "root"; 
		String pwd = "admin";
		Connection conn = null;
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load driver 
			conn = DriverManager.getConnection(url, uname,pwd); 
			System.out.println("Connected to DB!"); 
			//conn.close(); 
			} catch (Exception e) { 
			e.printStackTrace(); 
			} 
		
		try {
			String sql = "INSERT INTO users(username,password) VALUES (?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "kim");
			stmt.setString(2, "123456");
			stmt.executeUpdate();
			System.out.println("Record Inserted Successfully !!!");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		try {
			String sql = "SELECT * FROM USERS";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String password = rs.getString("password");
				System.out.println(id + " " + username + " " + password);
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		try {
			String sql = "UPDATE users SET username= ?,password = ? WHERE id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "fred");
			stmt.setString(2, "888888");
			stmt.setInt(3, 6);
			stmt.executeUpdate();
			System.out.println("Record Updated Successfully !!!");
		}catch(SQLException ex) {
			ex.printStackTrace();
		}	
		
		try {
			String sql = "DELETE from users where id = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, 4);
			stmt.executeUpdate();
			System.out.println("Record Deleted Successfully !!!");
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
}
