/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Librarian {
    private String name;
    private String librarian_id;
    private String password;
    private String Address;
    private String Email_id;
    private int Phone_no;
    Scanner sc=new Scanner(System.in);
    public Book addNewBook()
    { 	   
    	   Book b=new Book();
    	   System.out.println("enter author");
    	   b.Author=sc.nextLine();
    	   System.out.println("enter ISBN");
    	   b.ISBN=sc.nextLine();
    	   System.out.println("enter title");
    	   b.title=sc.nextLine();
    	   System.out.println("enter total_no_of_books");
    	   b.total_no_of_books=sc.nextInt();
    	   return b;
    }
    public void updateBook()
    {
        
    }
    public void removeBook()
    {
        System.out.println("1.author,2.title");
        int op=sc.nextInt();
        switch(op)
        {
        case 1:
        	System.out.println("enter author");
     	    String Author=sc.nextLine();
     	    break;
        case 2:
        	System.out.println("enter title");
     	    String title=sc.nextLine();
     	    break;
        } 
    }
    
    
    
    public void updateMember()
    {
        
    }
    
    
    
    public void addMember()
    {
        Member M=new Member();
        System.out.println("enter name");
 	   	M.name=sc.nextLine();
 	   	System.out.println("enter memberId");
 	   	M.memberId=sc.nextLine();
 	   	System.out.println("enter password");
 	   	M.password=sc.nextLine();
 	   	System.out.println("enter address");
 	 	M.address=sc.nextLine();
 	 	System.out.println("enter emailId");
 	 	M.emailId=sc.nextLine();
 	 	System.out.println("enter phoneNo");
 	 	M.phoneNo=sc.nextInt();
 	 	
        
    }
    
    
    
    
    
     public void removeMember()
    {
    	 System.out.println("1.name,2.memberId");
         int op=sc.nextInt();
         switch(op)
         {
         case 1:
         	System.out.println("enter name");
      	    String name=sc.nextLine();
      	    break;
         case 2:
         	System.out.println("enter memberId");
      	    String memberId=sc.nextLine();
      	    break;
         }  
        
    }
     

     
     
     
    public void searchBook()
    {
        System.out.println("1.author,2.title");
        int op=sc.nextInt();
        switch(op)
        {
        case 1:
        	System.out.println("enter author");
     	    String Author=sc.nextLine();
     	    break;
        case 2:
        	System.out.println("enter title");
     	    String title=sc.nextLine();
     	    break;
        }
    }
    
    
    
    public void issueBook()
    {
      
        
    }
    
    
    public void returnBook()
    {
        
    }
}
