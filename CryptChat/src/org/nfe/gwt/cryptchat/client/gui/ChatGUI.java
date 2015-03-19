package org.nfe.gwt.cryptchat.client.gui;

import org.nfe.gwt.cryptchat.client.ChatServiceClientImpl;
import org.nfe.gwt.cryptchat.shared.model.Message;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;



public class ChatGUI extends Composite{
	
	//Controller & RPC-Interface
	ChatServiceClientImpl service;
	
	//Main Panels
	VerticalPanel mainPanel; //outer box
	DisclosurePanel securetyPanel; //panel 4 securety settings
	ScrollPanel chatPanel; //chat dialog
	Grid inputPanel; //TetInput etc.
	
	//Main-Components with n33d for external Access
	FlowPanel chat;
	Button sendMessageBtn;

	public ChatGUI(ChatServiceClientImpl service) {
		// TODO Auto-generated constructor stub
		this.service = service;
		
		this.initialChatPanel();
		this.initialInputPanel();
		this.initialSecuretyPanel();
		this.initialMainPanel();
		
	}
	
	//Panel Architecture for chatGUI
	public void initialMainPanel(){
		this.mainPanel = new VerticalPanel();
		this.mainPanel.add(securetyPanel);
		this.mainPanel.add(chatPanel);
		this.mainPanel.add(inputPanel);
	}
	
	public void initialSecuretyPanel(){
		this.securetyPanel = new DisclosurePanel();
		
	}
	
	public void initialChatPanel(){
		this.chatPanel = new ScrollPanel();
	}
	
	public void initialInputPanel(){
		this.inputPanel = new Grid();
		
		TextBox inputTxtBox = new TextBox();
		inputTxtBox.setStylePrimaryName("inputTxtBox");
		
		this.sendMessageBtn = new Button("send");
		this.sendMessageBtn.setStylePrimaryName("sendMessageBtn");
		
		this.inputPanel.add(inputTxtBox);
		this.inputPanel.add(this.sendMessageBtn);
		
		
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
