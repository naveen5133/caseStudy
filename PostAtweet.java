package in.Tweet.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class PostAtweet {
	
	static final String DB_url="jdbc:mysql://localhost:3306/tweet_app";
	static final String user_name="root";
	static final String pass="root";
     	
	public void postATweet(){
	
		try(Connection con=DriverManager.getConnection(DB_url, user_name, pass);
				   PreparedStatement ps=con.prepareStatement("update tweets set tweet=? where email=?;");){
			   Scanner s=new Scanner(System.in);
			   
			   
			   System.out.println("post a tweet here");
		       String tweet = s.nextLine();
		       System.out.println("Enter your email");
			   String email =s.next();
		       
		       
		        ps.setString(1, tweet);
		        ps.setString(2,email);
		        ps.executeUpdate();
			   
			   System.out.println("You made changes successfully");
			   
			   
		       }catch(SQLException e) {
			   e.printStackTrace();
		   }

	    
	}

}
