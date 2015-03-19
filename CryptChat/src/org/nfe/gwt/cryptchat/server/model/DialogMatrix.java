package org.nfe.gwt.cryptchat.server.model;

import java.util.HashMap;

public class DialogMatrix {
	static HashMap chatMap = new HashMap();
	
	
	
	public static void addDialog(Dialog dialog){
		chatMap.put(dialog.getUniqueID(), dialog);
	}

	public static HashMap getChatMap() {
		return chatMap;
	}

	public static void setChatMap(HashMap chatMap) {
		DialogMatrix.chatMap = chatMap;
	}
	
	public static Dialog getDialog(String uniqueID){
		return (Dialog) chatMap.get(uniqueID);
	}
	
}
