public class HourlyWorker extends Employee2{



   private double hours;
   private double rate;

   public HourlyWorker(String firstName, String lastName, int employeeID, double hours, double rate){
      super(firstName, lastName, employeeID);
      setHours(hours); 
      setRate(rate); 
   }

   public double getHours(){
      return hours;
   }
   public double getRate(){
      return rate;
   }
   public void setHours(double hours){
      this.hours = hours;
   }
   public void setRate(double rate){
      this.rate = rate;
   }

   public String toString(){
      double earnings= hours<=40?hours*rate:(40*rate+(hours-40)*1.5*rate);
      return String.format("%15s%15s%10.2f (HOurly wage: %5.2f, hours worked: %4.2f", super.getFirstName(),super.getLastName(), 
            earnings, rate, hours);

   }


}
