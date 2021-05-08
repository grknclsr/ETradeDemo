package dataAccess.concretes;

import java.util.List;
import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class HibernateUserDao implements UserDao{
	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getName());
		
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
		System.out.println("Sisteme giriþ baþarýlý : "+ user.getName());
		
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
