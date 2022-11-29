package in.Tweet.in;

import java.util.Scanner;

public class Tweet_App {
	
	static final String DB_url="jdbc:mysql://localhost:3306/tweet_app";
	static final String user_name="root";
	static final String password="root";
			

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int ch;
		
		System.out.println("  Welocme to Tweet App ");
		System.out.println("************************");
        System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("3.Reset Password");
        
        ch=s.nextInt();
        
        switch(ch) {
        
        case 1:  Tweett_Register t=new Tweett_Register();
        	     t.register();
        	
	     break;
		 
        case 2:   Tweetapp_Login t1=new Tweetapp_Login();
                  t1.Login();
		 break;
		 
        case 3:  Tweet_Reset t2=new Tweet_Reset();
                  t2.Reset_password();
         break;
        default:
        	System.out.println("please choose a valid options"); 
			
        }
	}

}
