package org.nfe.gwt.cryptchat.client;

import java.util.List;

import org.nfe.gwt.cryptchat.shared.model.Message;
import org.nfe.gwt.cryptchat.shared.model.User;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("chatService")
public interface ChatService  extends RemoteService{
	
	String setUserActive(String username);
	
	String sendMessage(Message msg);
	
	Message listenForMessage();
	
	List<User> getAvailivleUser(String searchPattern);

}
