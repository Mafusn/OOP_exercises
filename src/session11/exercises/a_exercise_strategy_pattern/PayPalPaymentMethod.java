package session11.exercises.a_exercise_strategy_pattern;

import session11.exercises.a_exercise_strategy_pattern.PaymentMethod;
import session11.exercises.a_exercise_strategy_pattern.payments_apis.PayPal;

public class PayPalPaymentMethod implements PaymentMethod {
    private PayPal card;

    public PayPalPaymentMethod(PayPal card) {
        this.card = card;
    }

    @Override
    public Boolean pay(double quantity) {
        return card.processPayment(quantity);
    }
}
