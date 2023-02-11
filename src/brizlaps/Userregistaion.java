package brizlaps;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class user{
	   public void firstvalidation( String firstName) {
      	 if(Pattern.matches("^[A-Z][a-z]{4}",firstName)==true) {
      		 System.out.println("FirstName Found");
  
      	 }else {
      		 System.out.println("Not Found");
      		 
      	 }
      	 
       }
	   
	   public void lastvalidation(String lastName) {
		   if(Pattern.matches("^[A-Z]$",lastName)==true) {
			   System.out.println("LastName  Found");
		   }else {
			   System.out.println("Not Found");
		   }
	   }
	   
	   
	   public void emailvalidation(String Email) {
		   if(Pattern.matches("[a-z]+([+-.])?(.[a-z]+)?(.[0-9]+)?@([0-9]+.)?([a-z]+.)?$", Email)==true) {
			   System.out.println("Email valid");
		   }else {
			   System.out.println("Email not valid");
		   }
	   }
 }


public class Userregistaion {
	   private static Scanner sc = new Scanner(System.in);
       public static void main(String args[]) {
    	   System.out.println("Enter the firstname");
    	   String firstName=sc.next();
    	   
    	  
    	   
    	   user uc=new user();  // object creation
    	   uc.firstvalidation(firstName);
    	   
    	   System.out.println("Enter the lastname");
    	   String lastName=sc.next();
    	   uc.lastvalidation(lastName);
    	   
    	   System.out.println("Enter the Email");
    	   String email=sc.next();
    	   uc.emailvalidation(email);
    	   
    	   
       }
}
