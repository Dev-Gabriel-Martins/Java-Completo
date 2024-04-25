package model.services;

public class PaypalService implements OnlinePaymentService{
    public Double paymentFee(Double amount){
        return 1.1;
    }
    public Double interest(Double amount, Integer months){
        return 1.1;
    }
}
