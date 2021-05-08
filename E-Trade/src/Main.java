import business.abstracts.UserService;
import business.concretes.EmailNotificationManager;
import business.concretes.UserAuthManager;
import business.concretes.UserManager;
import entities.concrete.User;
import googleRegister.GoogleManager;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Gürkan","Çalýþýr","gurkan01c@gmail.com","123456");
		User user2 = new User(1,"Gürkan","Çalýþýr","gurkan01","123456");
		User user3 = new User(1,"Gürkan","Çalýþýr","gurkan01c@gmail.com","123");
		User user4 = new User(1,"G","Çalýþýr","gurkan01c@gmail.com","123456");
		User user5 = new User(1,"Gürkan","Çalýþýr","gurkan0221c@gmail.com","123456");
		UserService userService = new UserManager(new UserAuthManager(),new EmailNotificationManager(),new GoogleManager());
		userService.add(user1);
		System.out.println("*********************************");
		userService.add(user2);
		System.out.println("*********************************");
		userService.add(user3);
		System.out.println("*********************************");
		userService.add(user4);
		System.out.println("*********************************");
		userService.add(user5);
		System.out.println("*********************************");
		System.out.println("------------GÝRÝÞ DENEMESÝ-----------");
		userService.login(user1);
		System.out.println("*********************************");
		userService.login(user2);
		
	}

}
