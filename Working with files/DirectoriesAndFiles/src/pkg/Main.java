/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders){
            System.out.println(folder);
        }
        
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES");
        for (File file : files){
            System.out.println(file);
        }
        
        boolean success = new File(strPath + "\\newPast").mkdir();
        System.out.println("Directory created sucessfully: " + success);
        
        sc.close();
    }
}
