import java.util.Scanner;
import java.util.Locale;
public class maior_posicao {
    public static void main (String [] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantos numeros voce vai digitar?");
    int n = sc.nextInt();
    double[] vetor = new double[n];
    double maior = 0.0;
    int posicao = 0;
    
    for(int i =0;i<n;i++){
    System.out.println("Digite um numero: ");
    vetor[i] = sc.nextDouble();    
    }
    for(int i =0;i<n;i++){
    if(vetor[i] > maior){
        maior = vetor[i];
        posicao = i;
    }    
    }
    
    System.out.println("MAIOR VALOR = "+maior);
    System.out.println("POSICAO DO MAIOR VALOR = "+posicao);
    
    }
}
