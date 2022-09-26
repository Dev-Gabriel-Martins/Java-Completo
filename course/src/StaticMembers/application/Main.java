/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticMembers.application;

import StaticMembers.util.Calculator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gabs
 */
public class Main {
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c = Calculator.circumderence(radius); 
        
        double v = Calculator.volume(radius);
        
        System.out.println("Circumference: "+c);
        System.out.println("Volume : "+v);
        System.out.println("Pi: "+ Calculator.PI);
        
    }
}
