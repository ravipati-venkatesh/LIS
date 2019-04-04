package lis;
import java.sql.*;
import java.util.Scanner;

import entities.Book;
public class LIS {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
    	Class.forName("oracle.jdbc.driver.OracleDriver"); 
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Venky@1347"); 
        Statement stmt = con.createStatement(); 
        Book b=new Book();
        System.out.println("enter author");
        b.Author=sc.nextLine();
        System.out.println("enter ISBN");
        b.ISBN=sc.nextLine();
        System.out.println("enter title");
        b.title=sc.nextLine();
 	   	System.out.println("enter total_no_of_books");
 	   	b.total_no_of_books=sc.nextInt();
        String q1 = "insert into BOOK values ('" +b.ISBN+ "', '" +b.title+ "','" +b.Author+ "', " +b.total_no_of_books+ ","+b.total_no_of_books+ ")"; 
        int x = stmt.executeUpdate(q1); 
    }
    
}
