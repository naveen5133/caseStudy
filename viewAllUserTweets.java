package in.Tweet.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class viewAllUserTweets {
	
	static final String DB_url="jdbc:mysql://localhost:3306/tweet_app";
	static final String user_name="root";
	static final String pass="root";
	
	public void ViewAllUserTweets() {
		
		try(Connection con=DriverManager.getConnection(DB_url, user_name, pass);
				   PreparedStatement ps=con.prepareStatement("select tweet from tweets");){
			   
		        
		        ResultSet rs=ps.executeQuery();
		        
		        System.out.println("***All tweets made by users***");
		        
		        while(rs.next()) {
		        	
		        	System.out.println(rs.getString("tweet"));
		        }
			     
			   
		       }catch(SQLException e) {
			   e.printStackTrace();
		   }

	}

}
