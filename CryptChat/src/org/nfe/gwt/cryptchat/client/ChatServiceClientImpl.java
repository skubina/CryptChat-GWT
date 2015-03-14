package org.nfe.gwt.cryptchat.client;

import org.nfe.gwt.cryptchat.client.gui.ChatGUI;
import org.nfe.gwt.cryptchat.shared.model.Message;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class ChatServiceClientImpl implements ChatServiceClientIntf{
	
	private ChatServiceAsync service;
	private ChatGUI chatGUI;

	public ChatServiceClientImpl(String url) {
		super();
		// TODO Auto-generated constructor stub
		this.service = GWT.create(ChatService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
		endpoint.setServiceEntryPoint(url);
		
		this.chatGUI = new ChatGUI(this);
		
	}

	@Override
	public void sendMessage(Message msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listenForMessage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAvailivleUser(String searchPattern) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setUserActive(String username) {
		// TODO Auto-generated method stub
		
	}
	
	

}
