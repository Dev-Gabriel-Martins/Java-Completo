
import java.util.Scanner;
import java.util.Locale;

public class comerciante {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Serão digitados quantos produtos");
        int n = sc.nextInt();
        
        String[] nome = new String[n];
        double[] precoCompra = new double[n];
        double[] precoVenda = new double[n];
        double totalCompra = 0, totalVenda = 0, totalLucro =0;                        
        double[] porcLucro = new double[n];
        int porcA=0, porcB=0, porcC =0;
        
        for(int i =0; i < n; i++){
            
        System.out.println("Produto: "+ (i+1));
        System.out.println("Nome: ");
        nome[i] = sc.next();
        
        System.out.println("Preco de compra: ");
        precoCompra[i] = sc.nextDouble();
        
        System.out.println("Preco de venda: ");
        precoVenda[i] = sc.nextDouble();                
        }
        
        for(int i = 0; i < n; i++){
        totalCompra += precoCompra[i];
        totalVenda += precoVenda[i];
        }
        
        totalLucro = totalVenda - totalCompra;                
        
        for(int i=0; i< n;i++){
        porcLucro[i] = (precoVenda[i] - precoCompra[i]) / precoCompra[i]*100.0;
        }
        
        for(int i=0; i < n; i++){
         if(porcLucro[i] < 10){
            porcA++;
         } 
         else if(porcLucro[i]< 20.0){
             porcB++;
         }
            else{
             porcC++;
             }
        }
        
        System.out.println("Lucro abaixo de 10%: "+ porcA);
        System.out.println("Lucro entre 10% e 20%: "+ porcB);
        System.out.println("Lucro acima de 20% "+ porcC);
        System.out.println("Valor total de compra: "+ totalCompra);
        System.out.println("Valor total de venda: "+ totalVenda);
        System.out.println("Lucro total: "+ totalLucro);
        
        sc.close();
    }
    
}
