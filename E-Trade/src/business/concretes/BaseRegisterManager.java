package business.concretes;

import core.abstracts.BaseRegisterService;
import entities.concrete.User;

public class BaseRegisterManager implements BaseRegisterService{

	@Override
	public void add(User user) {
		System.out.println("Sisteme kayýt olundu : " +user.getName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Sisteme giriþ baþarýlý  : " + user.getName());
		
	}

}
