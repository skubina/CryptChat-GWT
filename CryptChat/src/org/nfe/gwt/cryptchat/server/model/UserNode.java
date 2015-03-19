package org.nfe.gwt.cryptchat.server.model;

import org.joda.time.DateTime;
import org.nfe.gwt.cryptchat.shared.model.User;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class UserNode {
	User user;
	DateTime timeStamp;
	RemoteServiceServlet servlet;
	
	
	
	public UserNode(User user, DateTime timeStamp, RemoteServiceServlet servlet) {
		super();
		this.user = user;
		this.timeStamp = timeStamp;
		this.servlet = servlet;
	}
	
	
	public RemoteServiceServlet getServlet() {
		return servlet;
	}

	public void setServlet(RemoteServiceServlet servlet) {
		this.servlet = servlet;
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
