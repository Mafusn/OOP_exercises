package session11.exercises.b_exercise_observer_pattern;

import session11.exercises.b_exercise_observer_pattern.subscribers_api.PhoneNotificationsService;

public class AppSubscriber implements Subscriber {
    private int phoneId;
    private PhoneNotificationsService phoneNotificationsService = new PhoneNotificationsService();

    public AppSubscriber(int phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public void update(String news) {
        this.phoneNotificationsService.notifyPhone(phoneId, news);
    }
}
