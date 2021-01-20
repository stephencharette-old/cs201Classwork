public class Payroll{

   public static void main(String[] args){
      
      Employee[] e=new Employee[3];
      e[0]=new Manager("A","B", 101, 2000);
      e[1]=new CommissionEmployee("C","D", 111, 1000, 7000, 0.05);
      e[2]=new HourlyWorker("E","G", 222, 50, 25);
      for(int i=0; i<e.length; i++)
         System.out.println(e[i].toString());
   }

}
