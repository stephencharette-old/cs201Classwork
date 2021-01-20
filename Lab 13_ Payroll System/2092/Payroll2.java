import java.io.*;
import java.util.*;

public class Payroll2{
   public static int empID=100;
   
   public static void main(String[] args) throws Exception{
      
      Scanner in=new Scanner(new File(args[0]));
      int size=in.nextInt();
      Employee[] e=new Employee[size];
      in.nextLine();
      int index=0;
      while(in.hasNextLine()){
         String line=in.nextLine().trim();
         char c=line.charAt(0);
         line=line.substring(1);
         switch(c){
            case '#': e[index]=parseManager(line, empID++); break;
            case '*': e[index]= parseCommission(line, empID++); break;
            case '@': e[index]=parseHourly(line, empID++);
         }
         index++;
      }
      
      in.close();
      for(int i=0; i<e.length; i++){
         System.out.println(e[i]);
      }
   }

   private static Manager parseManager(String line, int id){
      String[] data=line.split(",");
      double wage=Double.parseDouble(data[1]);
      String[] name=data[0].split(" ");
      return new Manager(name[0], name[1], id, wage);
   }
   private static CommissionEmployee parseCommission(String line, int id){
      String[] data=line.split(",");
      double rate=Double.parseDouble(data[3]);
      double sales=Double.parseDouble(data[2]);
      double salary=Double.parseDouble(data[3]);
      String[] name=data[0].split(" ");
      return new CommissionEmployee(name[0],name[1], id, salary, sales, rate);
   }
   
   public static HourlyWorker parseHourly(String line, int id){
      String[] data=line.split(",");
      double hours=Double.parseDouble(data[2]);
      double rate=Double.parseDouble(data[1]);
      String[] name=data[0].split(" ");
      return new HourlyWorker(name[0],name[1], id, hours, rate);
   }
}
