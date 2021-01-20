public class CommissionEmployee extends Employee2{



   private double salary;
   private double sales;
   private double rate;

   public CommissionEmployee(String firstName, String lastName, int employeeID, double salary, double sales, double rate){
      super(firstName, lastName, employeeID);
      setSalary(salary); 
      setSales(sales); 
      setRate(rate); 
   }

   public double getSalary(){
      return salary;
   }
   public double getSales(){
      return sales;
   }
   public double getRate(){
      return rate;
   }
   public void setSalary(double salary){
      this.salary = salary;
   }
   public void setSales(double sales){
      this.sales = sales;
   }
   public void setRate(double rate){
      this.rate = rate;
   }

   public String toString(){
      return String.format("%15s%15s%10.2f (Base salary:%5.2f, sales: %10.2f, Commission rate: %5.2f", super.getFirstName(), super.getLastName(), 
               salary+sales*rate,salary,sales, rate);
   }


}
