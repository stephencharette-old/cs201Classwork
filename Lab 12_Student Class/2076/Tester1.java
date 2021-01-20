public class Tester1{

   public static void main(String[] args){
      
      Student one = new Student( "Stephen","Charette",4.0 );
      Student two = new Student( "Michael","Hachem",1.7 );
      Student three = new Student( "Abby","Houser", 3.5 );
      System.out.println( ( one.getGPA() + two.getGPA() + three.getGPA() ) / 3.0 );
   }

}
