public class TossingCoinSimulation{

   public static void main(String[] args){
      int n = Integer.parseInt( args[0] );
      int z = 0;
      int o = 0;
      for( int i = 0; i < n; i++ ) {
         if( Math.random() > 0.5 ) {
            z++;
         }
         else
            o++;
      }
      System.out.println( "Heads (0) occured " + z + " times, and tails (1) occured " + o + " times" );
   }

}
