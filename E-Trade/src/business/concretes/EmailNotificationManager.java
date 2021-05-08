package business.concretes;

import business.abstracts.NotificationService;
import entities.concrete.User;

public class EmailNotificationManager implements NotificationService{

	@Override
	public void sendNotification(User user) {
		System.out.println("Mailinize bilgilendirme mesaj� g�nderildi : " + user.getName());
		
	}

	@Override
	public void sendActivationLink(User user) {
		System.out.println("Mailinize aktivasyon linki g�nderildi : " + user.getName());
		
	}

	@Override
	public boolean hasClickedToLink(User user) {
		boolean result = true;
		if(result) {
			System.out.println("Do�rulama ba�ar�l�!");
		}
		return result;
	}
	
}
