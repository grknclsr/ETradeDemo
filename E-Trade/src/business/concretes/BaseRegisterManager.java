package business.concretes;

import core.abstracts.BaseRegisterService;
import entities.concrete.User;

public class BaseRegisterManager implements BaseRegisterService{

	@Override
	public void add(User user) {
		System.out.println("Sisteme kay�t olundu : " +user.getName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Sisteme giri� ba�ar�l�  : " + user.getName());
		
	}

}
