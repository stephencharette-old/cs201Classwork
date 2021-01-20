public class Pencil{

   private String brand;
   private String color;
   private double price;

   public Pencil(String color, String brand, double price){
      setBrand(brand); 
      setColor(color); 
      setPrice(price); 
   }

   public String getBrand(){
      return brand;
   }
   public String getColor(){
      return color;
   }
   public double getPrice(){
      return price;
   }
   public void setBrand(String brand){
      this.brand = brand;
   }
   public void setColor(String color){
      this.color = color;
   }
   public void setPrice(double price){
      this.price = price;
   }

   public String toString() {
      
      return String.format( "%1$-10s %2$-10s %3$-10.2f", getColor(), getBrand(), getPrice() );
   }

}
