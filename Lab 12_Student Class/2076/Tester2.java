import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Tester2{

   public static void main(String[] args) throws FileNotFoundException {
      Scanner scan = new Scanner( new File( args[0] ) );
      ArrayList<Student> students = new ArrayList<>();
      while( scan.hasNextLine() ) {
         String firstName = scan.next();
         String lastName = scan.next();
         double GPA = Double.parseDouble( scan.next() );
         students.add( new Student( firstName, lastName, GPA ) );
         scan.nextLine();
      }
      toString( students );
   }
   
   public static void toString( ArrayList<Student> students ) {
      
      System.out.println( "Student Name" + "    GPA" );
      System.out.println( "-------------------" );
      for( int i = 0; i < students.size(); i++ ) {
         System.out.println( students.get(i).toString() );
      }
   }

}
