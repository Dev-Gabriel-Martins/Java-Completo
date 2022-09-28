import java.util.Scanner;
public class negativos {
  public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      
      System.out.println("Quantos numeros voce vai digitar?");
      int quant = input.nextInt();
      
     int[] num = new int[quant];
     
     
     for(int i=0;i < quant;i++){
     System.out.println("Digite um numero: ");
     num[i] = input.nextInt();
     
         
     }
     
     for(int i=0;i < quant;i++){
         if (num[i] < 0 ){     
        System.out.println("Numeros Negativos: " + num[i]);   
         } 
        
     }
  }   
}
