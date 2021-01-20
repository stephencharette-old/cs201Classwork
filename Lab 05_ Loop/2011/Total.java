public class Total{

   public static void main(String[] args){
      int n = Integer.parseInt( args[0] );
      int m = Integer.parseInt( args[1] );
      int total = 0;
      for( int i = n; i <= m; i++ ){
         total += i;
      }
      System.out.println( "N: " + n + " M: " + m + "\nThe total sum of the numbers between [n,m] is " + total );
   }

}
