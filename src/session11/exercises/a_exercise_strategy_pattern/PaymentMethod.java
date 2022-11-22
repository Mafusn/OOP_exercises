package session11.exercises.a_exercise_strategy_pattern;

import session11.exercises.a_exercise_strategy_pattern.payments_apis.MasterCard;

public interface PaymentMethod {
    Boolean pay(double quantity);
}
