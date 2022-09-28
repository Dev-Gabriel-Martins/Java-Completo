import java.util.Locale;
import java.util.Scanner;
public class mais_velho {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        
        
        String nome[] = new String[n];
        int idade[] = new int[n];
        int maior =0;
        String nomeMaior = "";
        
        for(int i =0; i < n;i++){
            System.out.println("Dados da "+i+"a pessoa:");
            System.out.println("Nome: ");
            nome[i] = sc.next();
            
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
        }
        
        for(int i =0; i < n;i++){
            if(idade[i] > maior){
                maior = idade[i];
                nomeMaior = nome[i];        
            }
        }
        
        System.out.println("Pessoal mais velha: "+ nomeMaior);
    }
}
