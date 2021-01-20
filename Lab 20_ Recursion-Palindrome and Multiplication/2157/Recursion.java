public class Recursion{

   public static void main(String[] args){
      
      System.out.println( multiplication( 3,1 ) );
   }
   
   public static boolean isPalindrome( String str ) {
      if( str.length() == 0 || str.length() == 1 ) {
         return true;
      }
      if( str.charAt(0) == str.charAt( str.length() - 1 ) ) {
         return isPalindrome( str.substring( 1, str.length() -1 ) );
      }
      return false;
   }
   
   public static int multiplication( int a, int b ) {
      if( b == 0 ) {
         return 0;
      }
      return a + multiplication( a, b-1 );
   }

}
