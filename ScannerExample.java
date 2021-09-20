// Java program to read data of various types using Scanner class.
import java.util.Scanner;

public class ScannerExample
{
  public static void main(String[] args){
      // Declare the object and initialize with
      // predefined standard input object
      Scanner sc = new Scanner(System.in);
      // String input
      String fullname = sc.nextLine();
      // Character input
      char gender = sc.next().charAt(0);
      // Numerical data input
      int yrofbrth = sc.nextInt();
      long mobileNo = sc.nextLong();
      float balance = sc.nextFloat();
      double gpa = sc.nextDouble();
      // Boolean data input
      boolean enroll = sc.nextBoolean();
      // Print the values to check if the input and
      //computation was correctly obtained.
      System.out.println("Name: "+fullname);
      System.out.println("Gender: "+gender);
      System.out.println("Year of Birth: "+yrofbrth);
      //Assignment statement to calculate estimated age
      int age=2020-yrofbrth;
      System.out.println("Estimated age: "+age);
      System.out.println("Mobile Number: "+mobileNo);
      System.out.println("GPA: "+gpa);
      System.out.println("Enrolled: "+enroll);
      System.out.println("Payment Balance: "+balance);
   }
}
