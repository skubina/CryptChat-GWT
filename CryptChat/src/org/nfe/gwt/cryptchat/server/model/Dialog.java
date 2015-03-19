package org.nfe.gwt.cryptchat.server.model;

import java.util.LinkedHashMap;

import org.nfe.gwt.cryptchat.shared.model.Message;

public class Dialog {
	
	LinkedHashMap dialog;
	int messageCount;
	String uniqueID;
	
	
	public Dialog(String uniqueID) {
		super();
		this.dialog = new LinkedHashMap();
		this.messageCount = 0;
		this.uniqueID = uniqueID;
	}
	
	public void addMessage(Message msg){
		this.dialog.put(messageCount, msg);
		messageCount++;
	}


	public LinkedHashMap getDialog() {
		return dialog;
	}


	public void setDialog(LinkedHashMap dialog) {
		this.dialog = dialog;
	}


	public int getMessageCount() {
		return messageCount;
	}


	public void setMessageCount(int messageCount) {
		this.messageCount = messageCount;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	
	
	
	
	
	

}
