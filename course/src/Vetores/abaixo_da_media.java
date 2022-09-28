/*
Problema "abaixo_da_media"
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

*/
import java.util.Scanner;
import java.util.Locale;

public class abaixo_da_media {
  public static void main(String[] args){
      
   Locale.setDefault(Locale.US);
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Quantos elementos vai ter o vetor");
   int n = sc.nextInt();
   
   double cont = 0;
   double media = 0;
   double[] ind = new double[n];
   double[] abaixoMedia = new double[n];
   
   
    for(int i = 0; i < n; i++ ){
        System.out.println("Digite um numero: ");
        ind[i] = sc.nextDouble();

        cont += ind[i]; 
        media = cont/ind.length;

    }
   
   System.out.println("Somas dos vetor :"+cont);
   System.out.println("Média :"+media); 
   
    for(int i =0; i < n; i++){

        if (ind[i] < media){
        abaixoMedia[i] = ind[i];
        System.out.println("Elementos abaixo da média: "+ abaixoMedia[i]);

        }
    }      
  }
}
  
 

