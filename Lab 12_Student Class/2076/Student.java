public class Student{

   private String firstName;
   private String lastName;
   
   private double GPA;

   public Student() {
      firstName = "";
      lastName = "";
      GPA = 0.0;
   }
   
   public Student( String firstName, String lastName, double GPA ) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.GPA = GPA;
   }

   //mutators
   public void setFirstName( String firstName ) {
      if( firstName.length() <= 25 ) this.firstName = firstName;
   }
   public void setLastName( String lastName ) {
      if( lastName.length() <= 25 ) this.lastName = lastName;
   }
   public void setGPA( double GPA ) {
      if( GPA >= 0.0 && GPA <= 4.0 ) this.GPA = GPA;
   }
   
   //accessors
   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public double getGPA() {
      return GPA;
   } 

   public String toString() {
      return getFirstName() + " " + getLastName() + "\t" + getGPA();
   } 
   
   public static void main( String args[] ){
      
   }
}
