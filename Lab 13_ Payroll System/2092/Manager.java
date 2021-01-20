public class Manager extends Employee{

   private double wage;
 
   public Manager(String firstName, String lastName, int employeeID, double wage){
      super(firstName, lastName, employeeID);
      setWage(wage); 
   }

   public double getWage(){
      return wage;
   }
   public void setWage(double wage){
      this.wage = wage;
   }

   public String toString(){
      return String.format("%15s%15s%10.2f", super.getFirstName(), super.getLastName(), wage);
   }


}
