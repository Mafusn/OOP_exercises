package session11.exercises.b_exercise_observer_pattern;

import session11.exercises.b_exercise_observer_pattern.subscribers_api.EmailService;
import session11.exercises.b_exercise_observer_pattern.subscribers_api.PhoneNotificationsService;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void notifySubscribers(String news) {
        for (Subscriber subscriber: subscribers) {
            subscriber.update(news);
        }
    }
}