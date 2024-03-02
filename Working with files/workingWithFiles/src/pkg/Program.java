
package pkg;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        // TODO code application logic here
        
        File file = new File("G:\\in.txt");
        
        try(Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error:" + e.getMessage());
        }
        
    }
    
}
