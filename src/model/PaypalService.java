package model;

public class PaypalService implements OnlinePaymentService{
    
    @Override
    public double paymentFee(double amount){
        return amount;
    }
    
    @Override
    public double interest (double amount, int months){
        return amount;
    }
    
}
