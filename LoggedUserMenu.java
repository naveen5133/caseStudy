package in.Tweet.in;

import java.util.Scanner;

public class LoggedUserMenu {
	
	public void userloggedin()
	{
	   
		System.out.println("1.Post a tweet");
		System.out.println("2.View my tweets");
		System.out.println("3.View all tweets");
		System.out.println("4.Reset Password");
		System.out.println("5.Logout");
		System.out.println("welcome Buddy!");
		
		Scanner s=new Scanner(System.in);
		
		int ch=s.nextInt();
		
		switch(ch) {
		  case 1: PostAtweet p=new PostAtweet();
		  p.postATweet();
		  break;
		  case 2: viewMytweets v=new viewMytweets();
		  v.ViewMyTweets();
		  break;
		  case 3: viewAllUserTweets q=new viewAllUserTweets();
		  q.ViewAllUserTweets();
		  break;
		  case 4:ForgetPassword f= new ForgetPassword();
		  f.forgetPassword();
		  break;
		  case 5: System.out.println("logout successfully");
		        break;
	        
	      default:
	    	    System.out.println("please choose a valid options"); 
		}
		
	}
}
