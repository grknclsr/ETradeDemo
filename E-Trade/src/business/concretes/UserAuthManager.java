package business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserAuthService;
import entities.concrete.User;

public class UserAuthManager implements UserAuthService{
	List<User> users = new ArrayList<User>();
	
	@Override
	public boolean isValid(User user) {
		return(isEmailValid(user.getEmail()) && isFirstNameValid(user.getName()) && isPasswordValid(user.getPassword())
				&&isEmailUnique(user.getEmail()));
	}

	public boolean isEmailValid(String email) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();
		if(!result) {
			System.out.println("Email adresiniz yanl�� formatta yaz�lm��t�r, l�tfen kontrol ediniz.");
		}
		return result;
	}
	
	public boolean isPasswordValid(String password) {
		boolean result = (password != null) && (password.length() >=6);
		if(!result) {
			System.out.println("Password bo� olmamal� ve en az 6 karakter uzunlu�unda olmal�d�r.");
		}
		return result;
	}
	
	public boolean isFirstNameValid(String name) {
		boolean result = (name.length() >=2) && (name != null);
		if(!result) {
			System.out.println("�sim bo� olmamal� ve en az 2 karakter uzunlu�unda olmal�d�r.");
		}
		return result;
	}
	
	public boolean isEmailUnique(String email) {
		
		boolean result = true;

		for(User user: users){
		  if(user.getEmail().equals(email)){
		    result=false;
		    break;
		  }
		}
		return result;
	}
}