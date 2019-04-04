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
public class Member {
    public String name;
    public String memberId;
    public String password;
    public String address;
    public String emailId;
    public int phoneNo;
    public int fine;
    Scanner sc=new Scanner(System.in);    
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
  
  
  
  public void viewIssuedBook()
  {
      
  }
  
  
  
  public void renewBook()
  {
      
  }
  public void reserveBook()
  {
      
  }
  public void viewFine()
  {
      
  }
}
