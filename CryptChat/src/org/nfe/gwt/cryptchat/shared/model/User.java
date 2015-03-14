package org.nfe.gwt.cryptchat.shared.model;

public class User {
	String username;
	String uniqueSessionID;
	
	
	
	public User(String username, String uniqueSessionID) {
		super();
		this.username = username;
		this.uniqueSessionID = uniqueSessionID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUniqueSessionID() {
		return uniqueSessionID;
	}
	public void setUniqueSessionID(String uniqueSessionID) {
		this.uniqueSessionID = uniqueSessionID;
	}
	
	
}
