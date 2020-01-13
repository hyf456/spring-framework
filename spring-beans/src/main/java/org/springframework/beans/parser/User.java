package org.springframework.beans.parser;

/**
 * @Description TODO
 * @Date 2020/1/13 11:00
 * @Author hanyf
 */
public class User {

	private String id;
	private String userName;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
