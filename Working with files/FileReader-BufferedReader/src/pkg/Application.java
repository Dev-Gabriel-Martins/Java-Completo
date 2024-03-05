/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg;

import java.io.BufferedReader;
import java.io.FileReader;
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
        // TODO code application logic here
        String path = "g:\\in.txt";        
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){            
            String line = br.readLine();            
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println("Error "+ e.getMessage());
        }
        
        }
        
    }
    

