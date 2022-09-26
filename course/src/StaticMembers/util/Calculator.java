
package StaticMembers.util;

/**
 *
 * @author gabs
 */
public class Calculator {
   public static final double PI = 3.14159;
   
   public static double circumderence(double radius){
        return 2.0 * PI * radius;
   }
   
   public static double volume(double radius){
       return 4.0 * PI * PI * radius * radius * radius / 3.0;
   }
   
   
}
