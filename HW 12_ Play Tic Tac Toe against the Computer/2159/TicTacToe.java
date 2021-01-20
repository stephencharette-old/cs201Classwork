//this is solution to HW5, use winner, whoseTurn and winner methods in TicTecToeGUI app
//Please study the code and integate to TTTGUI by yourself if you really want to learn!

import java.util.*;
import java.io.*;

public class TicTacToe{

   public static void main(String[] args) throws FileNotFoundException{
      
      //String board="...XO....";
      String board=normalizeBoard(args[0]); System.out.println(board);
      print(board);
      while(true){
         if(winner(board)!=null){
            System.out.println("Player "+winner(board)+" won!");
            //print(board);
            break;
         }
         if(possibleMove(board)==null){
            System.out.println("Tie");
            break;
         }
         System.out.println("\nPlayer: "+whoseTurn(board));
         board=move(board);
         print(board);
      }
   }
   public static void print(String board){
      for(int i=0; i<board.length(); i++){
         System.out.print(board.charAt(i)+" ");
         if((i+1) %3==0)
            System.out.println();
      }
   }
   public static String winner(String board){
      String[] lookup=new String[8];
      for(int i=0; i<3; i++)//rows
         lookup[i]=board.substring(i*3,i*3+3);
      for(int i=0; i<3; i++)//col
         lookup[i+3]=""+board.charAt(i)+board.charAt(i+3)+board.charAt(i+6);
      lookup[6]=""+board.charAt(0)+board.charAt(4)+board.charAt(8);
      lookup[7]=""+board.charAt(2)+board.charAt(4)+board.charAt(6);
      for(int i=0; i<lookup.length; i++)
         if(lookup[i].equals("XXX") || lookup[i].equals("OOO"))
            return lookup[i].substring(0,1);
      return null;
   }
   public static int[] possibleMove(String board){
      char[] c=board.toCharArray();
      String pm="";
      for(int i=0; i<c.length; i++)
         if(c[i]=='.')
            pm+=i;
      if(pm.length()>0){
         int[] arr=new int[pm.length()];
         for(int i=0; i<arr.length; i++)
            arr[i]=Integer.parseInt(pm.substring(i,i+1));
         return arr;
      }else return null;
   }
   public static String whoseTurn(String board){
      int x=0, o=0;
      for(int i=0; i<board.length(); i++)
         switch(board.charAt(i)){
            case 'X': x++; break;
            case 'O': o++;
         }
      if(x+o==9) return null;
      if(x>o){
         return "O";
       }else{
          return "X";
       }
   }
   public static String normalizeBoard(String board){
      board=board.toUpperCase().replaceAll("[^XO.]", ".");
      return board;
   }
   public static String move(String board){
      String w=whoseTurn(board);
      int[] pm=possibleMove(board);
      int index=(int)(Math.random()*pm.length);
      return board.substring(0,pm[index])+w+board.substring(pm[index]+1);
   }
}
