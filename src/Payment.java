interface Payment1 {
    void pay(double amount);
}

class CreditCardPayment implements Payment1 {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using Credit Card.");
    }
}

class UPIPayment implements Payment1 {
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made using UPI.");
    }
}

public class Payment {
    public static void main(String[] args) {

        Payment1 p1 = new CreditCardPayment();
        Payment1 p2 = new UPIPayment();

        p1.pay(5000);
        p2.pay(1500);
    }
}