import java.util.Scanner;

public class TicTacToe{
   
   
   private static boolean endGame = false;

   public static void main(String[] args){
      
      Scanner scan = new Scanner( System.in );
      String ans = scan.next();
      
      //Check if there is a winner, if not then
      //use move() method
      winner( ans );
      if( endGame ) { 
         print( ans );
         System.out.println( "THE WINNER IS: " + winner( ans ) );
         
      }
      else {
         String temp = move(ans);
         print( temp );
         System.out.println();
         System.out.println( temp );
      }
      
      //once move method has been executed
      //then check if there is a winner with
      //the new board
      
      
   }
   
   public static void changeEndGame() {
      if( endGame ) endGame = false;
      else endGame = true;
   }
   
   public static String move( String board ) {
      int[] moves = possibleMove( board );
      int index = (int)(Math.random() * moves.length);
      //        CHECK     [0,1) > [0,6) > [0,5]
      //whoseTurn
      //update the board
      int i = moves[index];
      char next = whoseTurn( board ).charAt(0);
      //change the string: board to update the game
      String b = board.substring(0,i) + next + board.substring( i+1 );
      //return
      return b;
   }
   
   public static String whoseTurn( String board ) {
      int x = 0;
      int o = 0;
      for( int i = 0; i < board.length(); i++ ) {
         if( board.charAt( i ) == 'X' ) x++;
         else if( board.charAt( i ) == 'O' ) o++;
      }
      if( x <= o ) return "X";
      else return "O";
   }
   
   public static void arrayToString( int[] arr ) {
      for( int i = 0; i < arr.length - 1; i++ ) {
         System.out.print( arr[i] + " " );
      }
      System.out.println( arr[ arr.length - 1 ] );
   } 
   public static int[] possibleMove( String board ) {
      String temp = "";
      for( int i = 0; i < board.length(); i++ ) {
         if( board.charAt( i ) == '.' ) {
            temp += i;
         }
      }
      int[] moves = new int[ temp.length() ];
      for( int i = 0; i < temp.length(); i++ ) {
         moves[i] = Integer.parseInt(temp.substring( i, i+1 ));
      }
      return moves;
   }
   
   
   public static String winner( String board ) {
      //checks if three in a row horizontal/verically
      char winner = 0;
      int h = 0;
      //HORIZONTALLY
      for( int j = 0; j < 3; j++ ) {
         char i = board.charAt( h );
         char ii = board.charAt( h+1 );
         char iii = board.charAt( h+2 );
         if( i==ii && ii==iii && i != '.' ) winner = i;
         h += 3;
      }
      //VERTICALLY
      h = 0;
      for( int j = 0; j < 3; j++ ) {
         char i = board.charAt( h );
         char ii = board.charAt( h+3 );
         char iii = board.charAt( h+6 );
         if( i==ii && ii==iii && i != '.' ) winner = i;
         h += 1;
      }
      
      //TOPLEFT TO BOTTOMRIGHT
      h = 0;
      for( int j = 0; j < 3; j++ ) {
         char i = board.charAt( h );
         char ii = board.charAt( h+4 );
         char iii = board.charAt( h+8 );
         if( i==ii && ii==iii && i != '.' ) winner = i;
      }
      
      //TOPRIGHT TO BOTTOMLEFT
      h = 2;
      for( int j = 0; j < 3; j++ ) {
         char i = board.charAt( h );
         char ii = board.charAt( h+2 );
         char iii = board.charAt( h+4 );
         if( i==ii && ii==iii && i != '.' ) winner = i;
      }
      
      if( winner != 0 ) changeEndGame();
      return "" + winner;
   }
   
   public static char[][] makeBoard( String board ) {
      char[][] b = new char[3][3];
      int n = 0;
      for( int i = 0; i < 3; i++ ) {
         for( int j = 0; j < 3; j++ ) {
            b[i][j] = board.charAt( 0 );
            n++;
         }
      }
      return b;
   }
   
   public static void print( String board ) {
      int n = 0;
      for( int i = 0; i < 3; i++ ) {
         for( int j = 0; j < 3; j++ ) {
            if( board.charAt( n ) == 79 || board.charAt( n ) == 88 ) {
               System.out.print( board.charAt( n ) );
            }
            else {
               System.out.print( "." );
            }
            n++;
         }
         System.out.println();
      }
   }

}
