package org.nfe.gwt.cryptchat.server.model;

import java.util.Iterator;
import java.util.LinkedList;

import org.joda.time.DateTime;
import org.nfe.gwt.cryptchat.shared.model.User;

public class UserList {
	
	static LinkedList<UserNode> userList = new LinkedList<UserNode>();
	
	static public void addUser(User user){
		
		boolean found = false;
		
		UserNode node = new UserNode(user, new DateTime());
		
		Iterator<UserNode> nodeList = userList.iterator();
		while(nodeList.hasNext()){
			if(nodeList.equals(node)){
				found=true;
			}
		}
		
		if(!found){
			userList.add(node);
		}
	}

	public static LinkedList<UserNode> getUserList() {
		return userList;
	}

	public static void setUserList(LinkedList<UserNode> userList) {
		UserList.userList = userList;
	}

	
	
}
