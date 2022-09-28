import java.util.Locale;
import java.util.Scanner;
        
public class soma_vetores {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantos valores vai ter cada vetor?");
    int n = sc.nextInt();
    
    int[] vetorA = new int[n];
    int[] vetorB = new int[n];
    
    System.out.println("Digite os valores do vetor A: ");
    for(int i = 0; i < n;i++){
    vetorA[i] = sc.nextInt();
    }
    
    System.out.println("Digite os valores do vetor B: ");
    for(int i = 0; i < n;i++){
    vetorB[i] = sc.nextInt();
    }
    
    System.out.println("Soma dos vetores:");
    for(int i = 0; i < n;i++){
    System.out.println(vetorA[i]+vetorB[i]);
    }
    
    }
}
