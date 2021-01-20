public class CountChar{

   public static int countChar( char c, String str ){
      int n = 0;
      for( int i = 0; i < str.length(); i++ ) {
         if( str.charAt( i ) == c  ) {
            n++;
         }
      }
      return n;
   }
   public static void main(String[] args){
     char c = args[0].charAt( 0 );
     System.out.println( countChar( c, args[1] ) );
      
   }

}
