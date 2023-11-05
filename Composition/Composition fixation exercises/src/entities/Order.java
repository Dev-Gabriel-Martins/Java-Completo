package entities;

import entities.enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus staus;
    private Client client;
    private List<OrderItem> orderItens = new ArrayList<>();
    
    

    public Order() {
    }

    public Order(Date moment, OrderStatus staus, Client client) {
        this.moment = moment;
        this.staus = staus;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItem() {
        return orderItens;
    }

    public void addItem(OrderItem orderItem) {
        orderItens.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItens.remove(orderItem);
    }

    public double total() {
		double sum = 0.0;
		for (OrderItem orderItem : orderItens) {
			sum += orderItem.subTotal();
		}
		return sum;
	}
    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(staus + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem orderItem : orderItens) {
			sb.append(orderItem + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
