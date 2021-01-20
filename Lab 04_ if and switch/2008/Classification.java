public class Classification{

   public static void main(String[] args){
      int c = Integer.parseInt( args[0] );
      switch( c ) {
         case 1: System.out.println( "Freshman" ); break;
         case 2: System.out.println( "Sophomore" ); break;
         case 3: System.out.println( "Junior" ); break;
         case 4: System.out.println( "Senior" ); break;
         default: System.out.println( "Please enter a valid number" );
      }
      
   }

}
