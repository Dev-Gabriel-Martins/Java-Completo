import java.util.Locale;
import java.util.Scanner;
public class alturas {
    
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Quantas pessoas serao digitadas: ");
    int n = sc.nextInt();
    
    String[] nome = new String[n];
    int[] idade = new int[n];
    double[] altura = new double[n];
    
    String[] subNome = new String[10];
    double media = 0;
    int aux = 0;
    int porc = 0;
    
        for(int i = 0; i < n; i++){
            
        System.out.println("Dados da "+ (i+1) +"°  pessoa: ");
        
        System.out.print("Nome:");      
        nome[i] = sc.next();
        // Meu código estava dando erro nessa parte por estava usando
        // o .nextLine e ele pulava o trecho do nome cai para idade direto
        // https://stackoverflow-com.translate.goog/questions/22458575/whats-the-difference-between-next-and-nextline-methods-from-scanner-class?_x_tr_sl=auto&_x_tr_tl=pt&_x_tr_hl=pt-BR
        
        System.out.println("Idade: ");
        idade[i] = sc.nextInt();
        
        System.out.println("Altura: ");
        altura[i] = sc.nextDouble();
        
        }
        
        for(int i = 0; i < n; i++){
        media += altura[i] / altura.length;

            if (idade[i] < 16){ 
            aux++; 
            subNome[i] += nome[i];
            }
        }
        
        porc = aux * 100 /  altura.length;
       
        
    System.out.println("Altura média: " + media);
    System.out.println("Pessoas com menos de 16 anos:" + porc);
    
    for(int i=0; i < n; i++){System.out.println(subNome[i]);}
    
    sc.close();
        
    }
    
}
