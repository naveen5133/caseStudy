package in.Tweet.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.junit.Test;

public class Tweett_Register {
	
	static final String DB_url="jdbc:mysql://localhost:3306/tweet_app";
	static final String user_name="root";
	static final String password="root" ;
	
	
	public void register(){
    
	try(Connection con=DriverManager.getConnection(DB_url, user_name, password);
			   PreparedStatement ps=con.prepareStatement("insert into login_form (first_name,email,password) values (?,?,?)");){
		   
		   Scanner s=new Scanner(System.in);
		   System.out.println("Enter First name");
		   String first_name=s.next();
		   System.out.println("Enter email Id");
		   String email=s.next();
		   System.out.println("Enter Password");
		   String password=s.next();
		   
		   ps.setString(1, first_name);
		   ps.setString(2, email);
		   ps.setString(3, password);
		   
		   ps.executeUpdate();
		   System.out.println("You have successfully Registered.");
		   System.out.println("You can use Tweet app by Loging in");
		   
		   System.out.println("You can login now(Y/N)");
		   String ch=s.next();
		   String y="Y";
		   String n = "N";
		if(ch.equals(y)) {
		   Tweetapp_Login t=new Tweetapp_Login();
		   t.Login();
		   }
		   else if(ch.equals(n)) {
			   System.out.println("Thanks for your registration");   
		   }
		   else {
			   System.out.println("You have entered a wrong choise");
		   }
		   
	   }catch(SQLException e) {
		   e.printStackTrace();
	   }
   }
}
