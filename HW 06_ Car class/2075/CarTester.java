import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class CarTester{

   public static void main(String[] args){
      Car c = new Car( 2008, "Volkswagen", 65.0 );
      c.accelerate();
      System.out.println( "The " + c.getYear() + " " + c.getMake() + " is going " + c.getSpeed() );
      for( int i = 0; i < 10000; i++ ) {
         c.accelerate();
      }
      System.out.println( "The " + c.getYear() + " " + c.getMake() + " is going " + c.getSpeed() );
   }

}
