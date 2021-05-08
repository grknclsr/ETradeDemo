package dataAccess.concretes;

import java.util.List;
import dataAccess.abstracts.UserDao;
import entities.concrete.User;

public class HibernateUserDao implements UserDao{
	@Override
	public void add(User user) {
		System.out.println("Kullan�c� eklendi : " + user.getName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi : " + user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� silindi : " + user.getName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Sisteme giri� ba�ar�l� : "+ user.getName());
		
	}

	@Override
	public void logout(User user) {
		System.out.println("Sistemden ��k�� ba�ar�l�.");
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}
	
}
