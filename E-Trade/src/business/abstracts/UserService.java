package business.abstracts;

import java.util.List;

import entities.concrete.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	List<User> getAll();
	void login(User user);
	void logout(User user);
}
