package business.abstracts;

import entities.concrete.User;

public interface UserAuthService {
	boolean isValid(User user);
}
