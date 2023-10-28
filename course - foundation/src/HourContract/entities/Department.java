
package HourContract.entities;

/**
 *
 * @author gabri
 */
public class Department {
    
    private String name;
    
    private Department(){
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
