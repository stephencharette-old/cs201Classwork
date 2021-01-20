public class MethodLab{

   public static void main(String[] args){
      //if you want an array with 50 random numbers
      //call createArr()
      
      //if you want a defined array with 30 elements
      //call thirty()
      int[] n = thirty();
      
      //to Test all: call testAll( int[] arr );
      testAll( n );
      
   }
   public static int[] thirty() {
      int[] n = 
      {1,5,3,8,33,7,22,6,253,53,6,8,3,6,31,64,99,
      53,81,33,58,33,10,55,23,677,23,62,5,1};
      return n;
   }
   
   public static int[] createArr() {
      int[] arr = new int[50];
      for( int i = 0; i < arr.length; i++ ) {
         arr[i] = (int)(Math.random() * 51) + 50;
      }
      return arr;
   }
   
   public static void testAll( int[] arr ) {
      System.out.println( "Max method returned: " + max( arr ) + "\nRange method returned: " + range( arr ) + "\nAbove Benchmark method returned: " + aboveBenchmark( 80, arr ) );
   }
   public static int max( int[] arr ) {
      int max = arr[0];
      for( int i = 1; i < arr.length; i++ ) {
         if( max < arr[i] ) {
            max = arr[i];
         }
      }
      return max;
   }
   public static int range( int[] arr ) {
      return max(arr) - min(arr);
      
   }
   public static int min( int[] arr ) {
      int min = arr[0];
      for( int i = 1; i < arr.length; i++ ) {
         if( min > arr[i] ) {
            min = arr[i];
         }
      }
      return min;
   }
   
   public static int aboveBenchmark( int benchmark, int[] arr ) {
      int n = 0;
      for( int i = 0; i < arr.length; i++ ) {
         if( arr[i] >= benchmark ) {
            n++;
         }
      }
      return n;
   }

}
