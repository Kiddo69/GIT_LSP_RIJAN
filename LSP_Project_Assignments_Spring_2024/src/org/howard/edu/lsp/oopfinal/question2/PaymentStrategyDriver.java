package org.howard.edu.lsp.oopfinal.question2;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Creating payment strategies
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");

        // Creating shopping carts with different payment strategies
        ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
        ShoppingCart cart2 = new ShoppingCart(payPalPayment);
        ShoppingCart cart3 = new ShoppingCart(bitcoinPayment);

        // Checkout
        cart1.checkout(100.0);
        cart2.checkout(50.0);
        cart3.checkout(75.0);
    }
}
