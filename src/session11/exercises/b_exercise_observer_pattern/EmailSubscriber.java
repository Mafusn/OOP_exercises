package session11.exercises.b_exercise_observer_pattern;

import session11.exercises.b_exercise_observer_pattern.subscribers_api.EmailService;

public class EmailSubscriber implements Subscriber {
    private String email;
    private EmailService emailService = new EmailService();

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String news) {
        this.emailService.sendEmail(this.email, news);
    }
}
