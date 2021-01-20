import java.util.Scanner;

public class Symmetry{

   public static void main(String[] args){
      
      symmetricNumber(1);
      symmetricNumber(2);
      symmetricNumber(3);
      symmetricNumber(4);
      symmetricNumber(5);
      
      symmetricNumber(10);
      symmetricNumber(12);
   }

   public static void symmetricNumber( int n ) {
      String f = "";
      if( n % 2 == 0 ) {  //if it is even
         String line = "";
         int max = n / 2;
         int cur = max;
         while( cur > 0 ) {
            line += "" + cur;
            cur --;
         }
         for( int i = max - 1; i >= 0; i-- ) {
            line += "" + line.charAt( i );
         }
         f = line;
      }
      else { 
         String line = "";
         int max = (n/2) + 1;
         int cur = max;
         while( cur > 0 ) {
            line += cur;
            cur--;
         }
         if( line.length() > 1 ) {
            for( int i = max-2; i >= 0; i-- ) {
               line += "" + line.charAt( i );
            }
         }
         f = line;
      }
      System.out.println( f );
   }
}
