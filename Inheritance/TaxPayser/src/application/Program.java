
package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<TaxPayer> list = new ArrayList<TaxPayer>();
        
        System.out.println("Enter the number of tax payers");
        int i = sc.nextInt();
        
        for(int j=1;j <= i; j++){
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company (i/c) ?");
            char type = sc.next().charAt(0);
        
        
        }
        
        
       sc.close();
     }
}
