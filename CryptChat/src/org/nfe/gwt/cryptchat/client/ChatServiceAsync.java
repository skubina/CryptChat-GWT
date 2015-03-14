package org.nfe.gwt.cryptchat.client;

import java.util.List;

import org.nfe.gwt.cryptchat.shared.model.Message;
import org.nfe.gwt.cryptchat.shared.model.User;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ChatServiceAsync {
	
	void setUserActive(String username, AsyncCallback callback);

	void sendMessage(Message msg, AsyncCallback callback);
	
	void listenForMessage(AsyncCallback callback);
	
	void getAvailivleUser(String searchPattern, AsyncCallback callback);
}
