import java.util.Scanner;
import java.util.Locale;

public class numero_pares {
    public static void main (String[] arg){
    Scanner sc = new Scanner(System.in); 
    Locale.setDefault(Locale.US);
       
        
    System.out.println("Quantas numeros voce vai digitar? ");
    int n = sc.nextInt();
    
    int vetor[] = new int[n];
    int vetorPar[] = new int[n];
    int count =0;
    
        for(int i=0;i<n;i++){
        System.out.print("Digite um numero:");
        vetor[i] = sc.nextInt();
        }
    
        System.out.println("NUMEROS PARES: ");
        
        for(int i=0;i<n;i++){
            
        if( (vetor[i]%2) == 0 ){
            
            vetorPar[i] = vetor[i];
            count++;
        } 
        
        if (vetorPar[i] != 0){
        System.out.print(" "+vetorPar[i]+ " ");
        }
        
        }
        
        System.out.println();
        System.out.println("Quantidades de pares:"+count);
        
    sc.close();
    }
}
