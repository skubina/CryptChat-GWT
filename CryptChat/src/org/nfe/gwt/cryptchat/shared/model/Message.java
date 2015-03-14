package org.nfe.gwt.cryptchat.shared.model;

import java.io.Serializable;

import com.google.gwt.user.client.ui.Label;

public class Message implements Serializable{
	
	String sender;
	String reciever;
	String timestamp;
	String status;
	String text;
	boolean own;
	
	
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReciever() {
		return reciever;
	}
	public void setReciever(String reciever) {
		this.reciever = reciever;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public boolean isOwn() {
		return own;
	}
	public void setOwn(boolean own) {
		this.own = own;
	}
	
	

	
	
}
