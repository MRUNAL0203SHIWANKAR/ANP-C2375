package org.practicaltest.question2;

public class NamePassword 
{
	String  Username;
	String Password;
	public NamePassword(String username, String password) {
		super();
		Username = username;
		Password = password;
	}
	@Override
	public String toString() {
		return "NamePassword [Username=" + Username + ", Password=" + Password + "]";
	}
	

}
