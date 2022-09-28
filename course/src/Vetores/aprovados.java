import java.util.Locale;
import java.util.Scanner;
public class aprovados {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos alunos serao digitados: ");
        int n = sc.nextInt();
        
        String nome[] = new String[n];
        String aprovados[] = new String[n];
        double nota1[] = new double[n];
        double nota2[] = new double[n];
        double media[] = new double[n];        
        
        for(int i = 0;i < n;i++){
        
            System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"a aluno");
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();            
            media[i] = (nota1[i] + nota2[i])/2;
        }
        
        System.out.println("Alunos aprovados: ");
        
        for(int i=0;i<n;i++){
            if(media[i] >= 6){
            aprovados[i] = nome[i];    
            System.out.println(aprovados[i]);                     
            }
        }
        
        
        
    }
}
