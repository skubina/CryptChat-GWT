package org.nfe.gwt.cryptchat.client;

import org.nfe.gwt.cryptchat.shared.model.Message;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ChatServiceClientIntf {
	
	void setUserActive(String username);

	void sendMessage(Message msg);
	
	void listenForMessage();
	
	void getAvailivleUser(String searchPattern);
}
