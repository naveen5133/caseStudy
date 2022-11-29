package in.Tweet.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class viewMytweets {
	
	static final String DB_url="jdbc:mysql://localhost:3306/tweet_app";
	static final String user_name="root";
	static final String pass="root";
	
	public void ViewMyTweets(){
		try(Connection con=DriverManager.getConnection(DB_url, user_name, pass);
				   PreparedStatement ps=con.prepareStatement("select tweet from tweets where email=?;");){
			   Scanner s=new Scanner(System.in);
			   
			   System.out.println("Enter your email");
			   String email =s.next();
			   
		       
		       
		        
		        ps.setString(1,email);
		        ps.executeQuery();
		        
		        ResultSet rs=ps.executeQuery();
		        
		        while(rs.next()) {
		        	
		        	System.out.println(rs.getNString("tweet"));
		        }
			   
			   System.out.println("Here is your tweets");
			   
			   
		       }catch(SQLException e) {
			   e.printStackTrace();
		   }

	}

}
