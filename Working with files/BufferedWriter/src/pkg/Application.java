
package pkg;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author gabri
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] lines = new String[]{"Good Morning","Good afternoon","Good night"};
        String path = "G:\\out.txt";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true) )){
            
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
