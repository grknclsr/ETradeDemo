package dataAccess.abstracts;

import java.util.List;

import entities.concrete.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	void login(User user);
	void logout(User user);
	List<User>getAll();
}
