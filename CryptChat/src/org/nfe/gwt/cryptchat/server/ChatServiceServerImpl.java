package org.nfe.gwt.cryptchat.server;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpRequest;
import org.nfe.gwt.cryptchat.client.ChatService;
import org.nfe.gwt.cryptchat.server.model.UserList;
import org.nfe.gwt.cryptchat.shared.model.Message;
import org.nfe.gwt.cryptchat.shared.model.User;

import com.google.gwt.dev.ModuleTabPanel.Session;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


public class ChatServiceServerImpl extends RemoteServiceServlet implements
ChatService{

	@Override
	public String sendMessage(Message msg) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message listenForMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAvailivleUser(String searchPattern) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setUserActive(String username) {
		// TODO Auto-generated method stub
		
		HttpServletRequest request = this.getThreadLocalRequest();
		HttpSession session = request.getSession(true);
		
		User user = (User) session.getAttribute("user");
		if(user == null){
			user = new User(username, SecurityTools.makeRendomHash());
		}
		
		UserList.addUser(user);
	
		
		return user.getUniqueSessionID();
	}

}
