package org.nfe.gwt.cryptchat.server;

import java.security.MessageDigest;


public class SecurityTools {
	
	public static String makeRendomHash(){
		
		double rendomInt = Math.random();
		String rendomHash = makeHash(""+rendomInt);
		
		return rendomHash;
		
	}
	
	public static String makeHash(String base){
		
		 try{
	            MessageDigest digest = MessageDigest.getInstance("SHA-256");
	            byte[] hash = digest.digest(base.getBytes("UTF-8"));
	            StringBuffer hexString = new StringBuffer();

	            for (int i = 0; i < hash.length; i++) {
	                String hex = Integer.toHexString(0xff & hash[i]);
	                if(hex.length() == 1) hexString.append('0');
	                hexString.append(hex);
	            }

	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
	}

	public static String preventInjection(String content) {
		String originalContent = new String(content);
		
		if (content == null) { 
			return null; 
		} 

		// Entfernen von < und >, um versteckte SQL-Befehle zu filtern.
		content = content.replaceAll("<", "&lt;").replaceAll(">", "&gt;");

		// Entfernen von () Klammern.
		content = content.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");

		// Entfernen von Apostrophe.
		content = content.replaceAll("'", "&#39;");

		// Entfernen von JavaScript Elemente.
		content = content.replaceAll("eval\\((.*)\\)", "");
		content = content.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
		content = content.replaceAll("script", "");

		// Entfernen von Standard-SQL-Befehle in Kombination mit
		// Anf�hrungszeichen und Anf�hrungszeichen mit '||'.
		content = content.replaceAll("insert|update|delete|having|drop|(\'|%27).(and|or).(\'|%27)|(\'|%27).%7C{0,2}|%7C{2}","");

		// Entfernen von "<img src" CSS Angriffen.
		content = content.replaceAll("/((\\%3C)|<)((\\%69)|i|(\\%49))((\\%6D)|m|(\\%4D))((\\%67)|g|(\\%47))[^\n]+((\\%3E)|>)/I","");

		// Vergleiche originalen Inhalt mit evtl. ge�ndertem Inhalt nach
		// �berpr�fung auf Injections
		if ((originalContent != null) && (content != null) && (!originalContent.equalsIgnoreCase(content))) {

			// Injection erkannt: originalContent!=content
			// Ggf. weitere Ma�nahmen implementieren / Vorg�nge abbrechen /
			// Meldung ausgeben / ...
			
		}

		return content;
	}
	


}
