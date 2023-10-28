
package Hostel.application;
import Hostel.entities.Hostel;
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
     
        
        System.out.print("how many rooms will be rented: ");
        int n = sc.nextInt();
        
                
        Hostel[] inn = new Hostel[10];
        
        for(int i =0; i < n ; i++ ){
        System.out.println("");    
        System.out.println("Rent: #"+ (i+1));
        
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        
   
        System.out.print("Email: ");
        String email = sc.nextLine();
        
        System.out.print("Room: ");
        int room = sc.nextInt();
        inn[room] = new Hostel(name, email);
            
        }
        
        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i = 0; i < inn.length ; i++){
            if ( inn[i] != null){
                
            System.out.println(i + ": "+ inn[i].getName()+ ", "+ inn[i].getEmail() );
            
            }
        }
        
        
        
    }
}
