package core.abstracts;

import entities.concrete.User;

public interface BaseRegisterService {
	void add(User user);
	void login(User user);
}
