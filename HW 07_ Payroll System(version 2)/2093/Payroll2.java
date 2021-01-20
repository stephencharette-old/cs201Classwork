import java.io.*;
import java.util.*;

public class Payroll2{
   public static int empID=100;
   
   public static void main(String[] args) throws Exception{
      
      Scanner in=new Scanner(new File(args[0]));
      ArrayList<Employee2> e=new ArrayList<Employee2>();
      int index=0;
      while(in.hasNextLine()){
         String line=in.nextLine().trim();
         char c=line.charAt(0);
         line=line.substring(1);
         switch(c){
            case '#': e.add( parseManager(line, empID++) ); break;
            case '*': e.add( parseCommission(line, empID++) ); break;
            case '@': e.add( parseHourly(line, empID++) );
         }
         index++;
      }
      
      in.close();
      for(int i=0; i<e.size(); i++){
         System.out.println(e.get(i));
      }
   }

   private static Manager parseManager(String line, int id){
      String l = removeSpaces( line );
      String[] data=l.split(",");
      double wage=Double.parseDouble(data[2]);
      return new Manager(data[0], data[1], id, wage);
   }
   private static CommissionEmployee parseCommission(String line, int id){
      String l = removeSpaces( line );
      String[] data=l.split(",");
      double rate=Double.parseDouble(data[4]);
      double sales=Double.parseDouble(data[3]);
      double salary=Double.parseDouble(data[2]);
      return new CommissionEmployee(data[0],data[1], id, salary, sales, rate);
   }
   
   public static HourlyWorker parseHourly(String line, int id){
      String l = removeSpaces( line );
      String[] data=l.split(",");
      double hours=Double.parseDouble(data[3]);
      double rate=Double.parseDouble(data[2]);
      return new HourlyWorker(data[0],data[1], id, hours, rate);
   }
   
   public static String removeSpaces( String line ) {
      String l = "";
      for( int i = 0; i < line.length() ; i++ ) {
         if( line.charAt(i) != ' ' ) {
            l += line.charAt( i );
         }
      }
      return l;
   }
}
