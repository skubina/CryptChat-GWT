package org.nfe.gwt.cryptchat.client.gui;

import org.nfe.gwt.cryptchat.client.ChatServiceClientImpl;
import org.nfe.gwt.cryptchat.shared.model.Message;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;



public class ChatGUI extends Composite{
	
	ChatServiceClientImpl service;
	VerticalPanel mainPanel;
	ScrollPanel chatPanel;
	Grid inputPanel;

	public ChatGUI(ChatServiceClientImpl service) {
		// TODO Auto-generated constructor stub
		this.service = service;
		
		this.initialChatPanel();
		this.initialInputPanel();
		this.initialMainPanel();
		
	}
	
	//Panel Architecture for chatGUI
	public void initialMainPanel(){
		mainPanel = new VerticalPanel();
		mainPanel.add(chatPanel);
		mainPanel.add(inputPanel);
	}
	
	public void initialChatPanel(){
		chatPanel = new ScrollPanel();
	}
	
	public void initialInputPanel(){
		inputPanel = new Grid();
	}
	
	//TextBubbles
	
	//UserTextBubble
	public VerticalPanel createUserTextBubble(Message message){
		VerticalPanel bubble = new VerticalPanel();
		HorizontalPanel upperPanel = new HorizontalPanel();
		HorizontalPanel lowerPanel = new HorizontalPanel();
		
		bubble.add(upperPanel);
		bubble.add(lowerPanel);
		
		
		
		return bubble;
		
	}
	
	
	//CommunicationTextBubble
	public VerticalPanel createPartnerTextBubble(Message message){
		VerticalPanel bubble = new VerticalPanel();
		HorizontalPanel upperPanel = new HorizontalPanel();
		HorizontalPanel lowerPanel = new HorizontalPanel();
		
		bubble.add(upperPanel);
		bubble.add(lowerPanel);
		
		
		return bubble;
		
	}

}
