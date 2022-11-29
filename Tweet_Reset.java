package in.Tweet.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;


public class Tweet_Reset {
	
	static final String DB_url="jdbc:mysql://localhost:3306/tweet_app";
	static final String user_name="root";
	static final String pass="root";
    
	public void Reset_password() {
		try(Connection con=DriverManager.getConnection(DB_url, user_name, pass);
				   PreparedStatement ps=con.prepareStatement("update login_form set password=? where email=?;");){
			   Scanner s=new Scanner(System.in);
			   
			   System.out.println("Enter your emailId");
			   String email=s.next();
			   System.out.println("enter new password");
			   String password=s.next();
			   
			   ps.setString(1, password);
			   ps.setString(2, email);
			   ps.executeUpdate();
			   
			   System.out.println("You made changes successfully");
			   
			   
		       }catch(SQLException e) {
			   e.printStackTrace();
		   }
			
	}
}
