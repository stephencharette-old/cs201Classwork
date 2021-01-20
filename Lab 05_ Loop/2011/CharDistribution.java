public class CharDistribution{

   public static void main(String[] args){
      String str = args[0].toUpperCase();
      int n = 0;
      for( int i = 0; i < str.length(); i++ ) {
         if( str.charAt(i) == 'A' ) {
            n++;
         }
      }
      System.out.println( n );
      
   }

}
