package business.concretes;

import business.abstracts.NotificationService;
import entities.concrete.User;

public class EmailNotificationManager implements NotificationService{

	@Override
	public void sendNotification(User user) {
		System.out.println("Mailinize bilgilendirme mesajý gönderildi : " + user.getName());
		
	}

	@Override
	public void sendActivationLink(User user) {
		System.out.println("Mailinize aktivasyon linki gönderildi : " + user.getName());
		
	}

	@Override
	public boolean hasClickedToLink(User user) {
		boolean result = true;
		if(result) {
			System.out.println("Doðrulama baþarýlý!");
		}
		return result;
	}
	
}
