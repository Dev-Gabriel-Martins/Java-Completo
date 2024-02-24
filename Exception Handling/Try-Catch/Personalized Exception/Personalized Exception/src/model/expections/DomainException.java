
package model.expections;

/**
 *
 * @author gabri
 */
public class DomainException extends RuntimeException {
    public DomainException(String msg){
        super(msg);
    }
}
