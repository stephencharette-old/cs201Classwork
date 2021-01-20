import java.util.Scanner;
import java.io.*;

public class SortingAlgorithm{

   public static void main(String[] args) throws FileNotFoundException{
      
      Scanner input=new Scanner(new File(args[0]));  
      int N= input.nextInt();
      int M = input.nextInt();
      int[] arr= new int[N*M];
      for(int i=0; i<N*M; i++){
         arr[i]=input.nextInt();
      }
      //I am done with the preparation of the arry
      input.close();
      //perform sorting
      int[] tmp=copyArra(arr);
      long s=System.nanoTime();
      bubbleSort(tmp);
      long e=System.nanoTime();
      System.out.println("bubble sort took "+(e-s)+" milliseconds");
      
      tmp=copyArra(arr);
      s=System.nanoTime();
      selectionSort(tmp); 
      e=System.nanoTime();
      System.out.println("selection sort took "+(e-s)+" nanoseconds");
   }

   private static int[] copyArra(int[] arr){//think about why we are doing this.
      int[] tmp=new int[arr.length];
      for(int i=0; i<tmp.length; i++)
         tmp[i]=arr[i];
      return tmp;
   }
   public static void selectionSort(int[] arr){
      for(int i=0; i<arr.length; i++){
         int maxIndex= 0;
         for(int k=0; k<arr.length - i; k++){
            if(arr[k]>arr[maxIndex])
               maxIndex=k;
         }
         //swap
         int tmp=arr[maxIndex];
         arr[maxIndex]=arr[arr.length-i-1];
         arr[arr.length-i-1]=tmp;
      }
   }

   public static void bubbleSort(int[] arr){
      for(int i=0; i<arr.length; i++){
         for(int k=0; k<arr.length-i-1; k++){
            if(arr[k]>arr[k+1]){ //swap
               int hold=arr[k+1];
               arr[k+1]=arr[k];
               arr[k]=hold;
            }
         }
      }
   }
}
