import java.util.Scanner;
import java.io.*;

public class GradeDistribution{

   public static void main(String[] args) throws FileNotFoundException{
      
      Scanner input=new Scanner(new File(args[0]));  
      
      int[] grades=new int[5];//[0] for[90-100], [1] for [80, 89] etc...
      
      while(input.hasNext()){
         String tmp=input.next();
         int g=0;
         try{
            g=Integer.parseInt(tmp);
         }catch(NumberFormatException e){
            continue;
         }
         if(g<0 || g>100){
            continue;
         }
         if(g>89) grades[0]++;
         else if(g>=80) grades[1]++;
         else if(g>=70) grades[2]++;
         else if(g>=60) grades[3]++;
         else  grades[4]++;
      }
      
      input.close();
      
      String[] lbl={"[90 - 100]","[80 - 89]", "[70 - 79]","[60 - 69]", "[Below 60]"};
      
      for(int i=0; i<grades.length; i++){
         System.out.printf("%-15s%5d%n",lbl[i],grades[i]);
      }
   }

}
