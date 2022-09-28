/*
Problema "media_pares "
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
*/
import java.util.Scanner;
import java.util.Locale;

public class media_pares {
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    System.out.println("Quantos elementos vai ter o vetor? ");
    int n = sc.nextInt();
    
    int[] vet = new int[n];
    int[] vetPar = new int[n];
    int cont = 0;
    int aux = 0;
    boolean verifica = false;
    
        for(int i = 0; i < n; i++){
        System.out.println("Digite um numero: ");
        vet[i] = sc.nextInt();         
        }
        
        for(int i = 0; i < n; i++){
            if (vet[i]%2 == 0 ){
                
            vetPar[i] = vet[i];
            cont += vetPar[i];
            aux++;
            verifica = true;
            
            }else if(vetPar[i] == 0){
                verifica = false;
            }        
        } 
        
        if(verifica){
            
            int media = cont/aux;        
            System.out.println("Media dos Pares: " + media);
            
        }else{
            
            System.out.println("Nenhum mumero par");
        }
                
    }
}
