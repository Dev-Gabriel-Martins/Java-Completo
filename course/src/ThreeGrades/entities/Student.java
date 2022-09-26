

package ThreeGrades.entities;

/**
 *
 * @author gabs
 */
public class Student {
    
    public String name;
    public double firstTrimester;
    public double secundTrimester;
    public double thirdTrimester;
    
    public double finalGrade(){
    return firstTrimester + secundTrimester + thirdTrimester;
    }
    
    public String toString(){
    return "Final grade = "+ String.format("%.2f%n", finalGrade());
    }
    
    public void verificationGrade(){
        if(finalGrade() > 60){            
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
            double fg = 60 - finalGrade();
            System.out.println("Missing " + String.format("%.2f",fg) +" points");
        }
    }
}
