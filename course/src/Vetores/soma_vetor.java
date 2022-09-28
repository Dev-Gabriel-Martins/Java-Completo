import java.util.Locale;
import java.util.Scanner;
        
public class soma_vetor {
   
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        
        
        int n;
        double soma = 0;
        double media = 0;
        
        
        System.out.println("Quantos numeros voce vai digitar? ");
        n = input.nextInt();
         
        double[] vet = new double[n]; 
        // O tamanho do indice do vetor só pode ser uma inteiro
                
        for(int i=0;i < vet.length ;i++){
         System.out.println("Digite um numero: ");
     
         vet[i] = input.nextDouble();
   
         }        
         
         for(int i=0;i < vet.length ;i++){
             
          soma += vet[i];
          media = soma / vet.length;   
         
         }
         
         System.out.print("VALORES: " +" ");
         
         for (int i = 0; i < n; i++){
             
         System.out.print(vet[i] + " ");
                  
         }
        
         System.out.println();
         System.out.println("SOMA: "+soma);
         System.out.println("MEDIA: "+media);
    
    }
}
