import java.util.Scanner;
public class GradeDistribution{

   public static void main(String[] args){
      Scanner scan = new Scanner( System.in );
      int[] grades = new int[ 10 ];
      int[] dis = new int[5];
      for( int i = 0; i < grades.length; i++ ) {
         grades[i] = scan.nextInt();
         if( grades[i] >= 90 ) dis[0]++;
         else if( grades[i] >= 80 ) dis[1]++;
         else if( grades[i] >= 70 ) dis[2]++;
         else if( grades[i] >= 60 ) dis[3]++;
         else dis[4]++;
      }
      
      System.out.println( "Grade Range\tNo." );
      System.out.println( "[90 - 100]\t " + dis[0] );
      System.out.println( "[80 - 89]\t  " + dis[1] );
      System.out.println( "[70 - 79]\t  " + dis[2] );
      System.out.println( "[60 - 69]\t  " + dis[3]);
      System.out.println( "[0 - 59]\t   " + dis[4] );
      
      
   }

}
