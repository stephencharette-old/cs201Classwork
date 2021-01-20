public class SchoolBag{

   public static void main(String[] args){
      Pencil p1 = new Pencil( "Black","BIC",1.19);
      Pencil p2 = new Pencil( "Yellow","Ticonderonda",0.99);
      
      PencilBox pb = new PencilBox( p1, p2, 3, 6 );
      
      
      System.out.println( String.format( "%1$-10s %2$-10s %3$-10s", "Color", "Brand","Subtotal" ) );
      System.out.println( pb.toString() );
      System.out.println( p1.toString() );
   }
   
}
