package Behavioral.Strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

<<<<<<< HEAD
=======
/**
 * Concrete strategy. Implements credit card payment method.
 */
>>>>>>> b9e562aa98307ddea185f6e3104b32aea9ebde04
public class PayByCreditCard implements PayStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard card;

<<<<<<< HEAD
=======
    /**
     * Collect credit card data.
     */
>>>>>>> b9e562aa98307ddea185f6e3104b32aea9ebde04
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new CreditCard(number, date, cvv);

            // Validate credit card number...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

<<<<<<< HEAD
=======
    /**
     * After card validation we can charge customer's credit card.
     */
>>>>>>> b9e562aa98307ddea185f6e3104b32aea9ebde04
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}
