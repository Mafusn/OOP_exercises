package session11.exercises.a_exercise_strategy_pattern;

import session11.exercises.a_exercise_strategy_pattern.payments_apis.MasterCard;

public class MastercardPayment implements PaymentMethod{
    private MasterCard card;

    public MastercardPayment(MasterCard card) {
        this.card = card;
    }

    @Override
    public Boolean pay(double quantity) {
        return card.chargeToTheCreditCard(quantity);
    }
}
