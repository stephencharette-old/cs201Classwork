public class Manipulating2DArrays{

   public static void main(String[] args){
      
      int[][] board = { {-1,-1,0,0,0,0},
                        {0,0,-1,0,0,0},
                        {-1,0,0,0,0,0},
                        {0,0,0,-1,0,-1},
                        {0,0,0,-1,0,0},
                        {0,0,0,0,0,0} };
      //setHints( board );
      
      int[][] b = { {0,-1,3,1,2},
                     {1,4,1,2,0,1,1},
                     {2,1,1,-1,1,1,1,0 } };
      addTo10( b );
      
   }
   public static void addTo10( int[][] array ) {
     
     for( int r = 0; r < array.length; r++ ) {
        
        int sum = 0;   //the sum of row, r
        int i = 0;     //the C here array[r][C] == 0
        for( int c = 0; c < array[r].length; c++ ) {
           if( array[r][c] == 0 ) {
              i = c;
           }
           else sum += array[r][c];
        }
        if( sum < 10 ) {
           array[r][i] = 10-sum;
        }
     }
     
     print( array );
      
   }
      
   public static void setHints( int[][] array ) {
      int count = 0;
      for( int r = 0; r < array.length; r++ ) {
         for( int c = 0; c < array[r].length; c++ ) {
            if( array[r][c] == -1 ) {
               count++;
               test( r - 1, c - 1, array ); test( r - 1, c, array ); test( r - 1, c + 1, array );
               test( r, c - 1, array );                              test( r, c + 1, array );
               test( r + 1, c - 1, array ); test( r + 1, c, array ); test( r + 1, c + 1, array );
            }
         }
      }
      print( array );
      
      
   }
   
   public static void print( int[][] array ) {
      for( int i = 0; i < array.length; i++ ) {
         for( int j = 0; j < array[i].length; j++ ) {
            System.out.print( array[i][j] + " " );
         }
         System.out.println();
      }
   }
   
   public static void test( int r, int c, int[][] array ) {
      if( r >= 0 && c >= 0 && r < array.length && c < array[0].length ) {
         if( array[r][c] != -1 ) {
            array[r][c] += 1;
         }
      }
   }

}
