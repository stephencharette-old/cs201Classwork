public class Employee2{

   private String firstName;
   private String lastName;
   private int employeeID;

   public Employee2(String firstName, String lastName, int employeeID){
      setFirstName(firstName); 
      setLastName(lastName); 
      setEmployeeID(employeeID); 
   }

   public String getFirstName(){
      return firstName;
   }
   public String getLastName(){
      return lastName;
   }
   public int getEmployeeID(){
      return employeeID;
   }
   public void setFirstName(String firstName){
      this.firstName = firstName;
   }
   public void setLastName(String lastName){
      this.lastName = lastName;
   }
   public void setEmployeeID(int employeeID){
      this.employeeID = employeeID;
   }


}
