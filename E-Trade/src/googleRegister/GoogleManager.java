package googleRegister;

import core.abstracts.BaseRegisterService;
import entities.concrete.User;

public class GoogleManager implements BaseRegisterService{
	
	public void add(User user) {
		System.out.println("Sisteme google ile kayýt olundu : " +user.getName());
	}

	@Override
	public void login(User user) {
		System.out.println("Sisteme google hesabýnýz ile girdiniz : " + user.getName());
		
	}
}
