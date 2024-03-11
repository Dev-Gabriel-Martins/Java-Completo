
package pkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "g:\\input.csv";
        List<Product> product = new ArrayList<Product>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){            
            String line = br.readLine();
            String[] values = line.split(",");
            
            System.out.println(values[1]);
            
            
            
            /*for (String value : values) {
            System.out.println(value);
        } */
        }catch(IOException e){
            System.out.println("Error "+ e.getMessage());
        }
        
        
        
        sc.close();
    }
    
}
