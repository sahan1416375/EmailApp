
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity=500;
    private int defaultPasswordLength=10;
    private String alternateEmail;
    private String company= "xyzcompany.com";
    
    //constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email is Created: "+ this.firstName +" "+ this.lastName);
       
       
    //call a method asking for the department - return the department
    this.department=setDepartment();
    System.out.println("Your department is : "+this.department);

    //call method that returns a rando, password
    this.password=randomPassword(defaultPasswordLength);
    System.out.println("Your password is: "+this.password);
    
    //set the alternative email
    this.alternateEmail=firstName.toLowerCase()+ "." +lastName.toLowerCase()+ "@" +department+ "." +company;
    System.out.println("Your Email is : "+this.alternateEmail);
}
    
    //Ask for the department
    private String setDepartment(){
        System.out.println("Enter the department\n1 for sales\n2 for development\n3 for accounting\n0 for none\n Enter department codes to: ");
        Scanner in = new Scanner(System.in);
        int depChoice= in.nextInt();
        if(depChoice==1){
            System.out.println("over");
            return "sales";
        }
        else if(depChoice==2){
            return "dev";
        }
        else if(depChoice==3){
            return "acct";
        }
        else{
            return "";
        }
        //System.out.println("Success");
    }
   
    //Genarate a random password
    private String randomPassword(int Length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password =new char[Length];
        for(int i=0;i<Length;i++){
          int rand= (int)(Math.random() * passwordSet.length());
          password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    public void setAlternativeEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    
    public void setchangePassword(String password){
        this.password=password;
    }
    
    public int getMailBoxCapacity(){
        return mailboxCapacity;
    }
    
    public String getAlternateEmail(){
        return alternateEmail;
    }
    
    public String getchangePassword(){
        return password;
    }
}
    
    
    //set the mailbox capacity
    //set the alternate email
    //change the password
    

