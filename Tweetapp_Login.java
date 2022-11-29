package in.Tweet.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Tweetapp_Login {
    
	static final String DB_url="jdbc:mysql://localhost:3306/tweet_app";
	static final String user_name="root";
	static final String password="root";
	
	public void Login() {
		try(Connection con=DriverManager.getConnection(DB_url, user_name, password);
				   PreparedStatement ps=con.prepareStatement("select * from login_form where email=? and password=?;");){
			   Scanner s=new Scanner(System.in);
			   
			   System.out.println("enter username id");
			   String email=s.next();
			   System.out.println("enter password");
			   String password=s.next();
			   
			   ps.setString(1, email);
			   ps.setString(2, password);
			   
			   ResultSet rs=ps.executeQuery();
			   if(rs.next()) {
				   System.out.println("Login successfully\n");
				   LoggedUserMenu L=new LoggedUserMenu();
				   L.userloggedin();
			   }
			   else {
				   System.out.println("Login failed");
			   }
			   
		       }catch(SQLException e) {
			   e.printStackTrace();
		       }
	}
}
