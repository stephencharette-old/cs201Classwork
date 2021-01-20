public class TotalWhile{

   public static void main(String[] args){
      int n = Integer.parseInt( args[0] );
      int m = Integer.parseInt( args[1] );
      int total = 0;
      int i = n;
      while( i <= m ) {
         total += i;
         i++;
      }
      System.out.println( "N: " + n + " M: " + m + "\nThe total sum of the numbers between [n,m] is " + total );
   }

}
