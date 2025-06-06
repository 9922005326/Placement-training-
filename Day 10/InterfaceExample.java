interface PaymentGateway{
    boolean processpayment(double amount);
    String getTransactionId(String transactionId);
}

class CreditCardPayment implements PaymentGateway{
    public boolean processpayment(double amount){
        System.out.println("Processing Amount: "+amount);
        return true;
    }
    public String getTransactionId(String transactionId){
        System.out.println("Credit card TransactionId: "+transactionId);
        return transactionId;
    }
}

class UPIPayment implements PaymentGateway{
    public boolean processpayment(double amount){
        System.out.println("Processing Amount: "+amount);
        return true;
    }
    public String getTransactionId(String transactionId){
        System.out.println("Credit card TransactionId: "+transactionId);
        return transactionId;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        CreditCardPayment cc = new CreditCardPayment();
        cc.processpayment(1000);
        cc.getTransactionId("txn11223344");
        UPIPayment p = new UPIPayment();
        p.processpayment(2000);
        p.getTransactionId("txn123456");
    }
}
