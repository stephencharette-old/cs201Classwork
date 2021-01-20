public class GradeDistribution{

   public static void main(String[] args){
      int n = Integer.parseInt( args[0] );
      int[] grades = new int[n];
      double total = 0.0;
      for( int i = 0; i < grades.length; i++ ) {
         grades[i] = (int)(Math.random() * 100) + 1;
         total += grades[i];
      }
      System.out.println( total / n );
   }

}
