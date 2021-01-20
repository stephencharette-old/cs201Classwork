public class PencilBox{

   private Pencil type1;
   private Pencil type2;
   private int qty1;
   private int qty2;

   public PencilBox(Pencil type1, Pencil type2, int qty1, int qty2){
      setType1(type1); 
      setType2(type2);
      if( qty1 + qty2 > 10 || qty1 + qty2 < 10 ) {
         setQty1( 5 );
         setQty2( 5 );
      } 
      else {
         setQty1(qty1); 
         setQty2(qty2);   
      }
      
   }

   public Pencil getType1(){
      return type1;
   }
   public Pencil getType2(){
      return type2;
   }
   public int getQty1(){
      return qty1;
   }
   public int getQty2(){
      return qty2;
   }
   public void setType1(Pencil type1){
      this.type1 = type1;
   }
   public void setType2(Pencil type2){
      this.type2 = type2;
   }
   public void setQty1(int qty1){
      this.qty1 = qty1;
   }
   public void setQty2(int qty2){
      this.qty2 = qty2;
   }
   
   public double grandTotal() {
      return (getQty1() * type1.getPrice()) + (getQty2() * type2.getPrice());
   }
   
   public String toString() {
      
      
      String first = String.format( "%1$-10s %2$-10s %3$-10.2f", getType1().getColor(), getType1().getBrand(), (getQty1() * getType1().getPrice()) );
      String second = String.format( "%1$-10s %2$-10s %3$-10.2f", getType2().getColor(), getType2().getBrand(), (getQty2() * getType2().getPrice()) );
      return first + "\n" + second;
   }


}
