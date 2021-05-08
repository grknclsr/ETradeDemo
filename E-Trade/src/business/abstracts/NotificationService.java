package business.abstracts;

import entities.concrete.User;

public interface NotificationService {
	void sendNotification(User user);
	void sendActivationLink(User user);
	boolean hasClickedToLink(User user);
}
