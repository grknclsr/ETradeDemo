package business.concretes;

import java.util.List;

import business.abstracts.NotificationService;
import business.abstracts.UserAuthService;
import business.abstracts.UserService;
import core.abstracts.BaseRegisterService;
import entities.concrete.User;

public class UserManager implements UserService{

	UserAuthService userAuthService;
	NotificationService notificationService;
	BaseRegisterService baseRegisterService;
	public UserManager(UserAuthService userAuthService,NotificationService notificationService,BaseRegisterService baseRegisterService) {
		this.userAuthService = userAuthService;
		this.notificationService = notificationService;
		this.baseRegisterService = baseRegisterService;
	}
	@Override
	public void add(User user) {
		if(userAuthService.isValid(user)) {
			notificationService.sendActivationLink(user);
			notificationService.hasClickedToLink(user);
			baseRegisterService.add(user);
		}else {
			System.out.println("Sisteme ekleme baþarýsýz, lütfen bilgilerinizi kontrol ediniz : " + user.getName());
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi : " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.getName());
		
	}

	@Override
	public void login(User user) {
		if(userAuthService.isValid(user)) {
			baseRegisterService.login(user);
		}else {
			System.out.println("Sisteme giriþ baþarýsýz. Lütfen bilgilerinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void logout(User user) {
		System.out.println("Sistemden çýkýþ baþarýlý.");
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}


}
