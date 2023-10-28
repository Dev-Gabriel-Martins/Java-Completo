
package ThreeGrades.application;

import ThreeGrades.entities.Student;
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
        Student student = new Student();
        
        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        
        System.out.println("Enter grades for the three semesters:");
        student.firstTrimester = sc.nextDouble();
        student.secundTrimester = sc.nextDouble();
        student.thirdTrimester = sc.nextDouble();
        
        System.out.print(student);
        student.verificationGrade();
        
       sc.close();
    }               
            
}
