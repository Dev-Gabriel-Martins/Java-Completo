
package entities;

import entities.enums.OrderStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Order {
    
    private Date moment;
    private OrderStatus staus;
    private List<OrderItem> orderItens = new ArrayList<>();
    
    public Order(){
    }

    public Order(Date moment, OrderStatus staus) {
        this.moment = moment;
        this.staus = staus;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStaus() {
        return staus;
    }

    public void setStaus(OrderStatus staus) {
        this.staus = staus;
    }

    public List<OrderItem> getOrderItem() {
        return orderItens;
    }
    
    public void addItem(OrderItem orderItem){
        orderItens.add(orderItem);
    }
    
    public void removeItem(OrderItem orderItem){
        orderItens.remove(orderItem);
    }
    
    public String toString(){
    
        return null;
    
    }
    
    
}
