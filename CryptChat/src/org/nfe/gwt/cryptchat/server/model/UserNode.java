package org.nfe.gwt.cryptchat.server.model;

import org.joda.time.DateTime;
import org.nfe.gwt.cryptchat.shared.model.User;

public class UserNode {
	User user;
	DateTime timeStamp;
	
	
	
	public UserNode(User user, DateTime timeStamp) {
		super();
		this.user = user;
		this.timeStamp = timeStamp;
	}
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public DateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(DateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	

}
