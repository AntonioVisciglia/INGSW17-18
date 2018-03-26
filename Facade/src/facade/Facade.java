package facade;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public interface Facade {
	public static void sendMessage(String send, String object, String messageArea) {
      
		MimeMessage message;
		PropertiesStream propertiesStream = new PropertiesStream();
		ReadSender readSender = new ReadSender(); 
		ReadObject readObject = new ReadObject();
		ReadMessage readMessage = new ReadMessage();
		SenderEmail senderEmail =  new SenderEmail();

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(propertiesStream.setPropertiesStream());

	      try {
	          message = new MimeMessage(session);
	          message.setFrom(new InternetAddress("antonio01.visciglia@gmail.com"));

	          // chiamata al Set to
	          readSender.setTo(message, send);

	          // chiamata al set Oggeto
	          readObject.setObject(message, object);

	          // chiamata al set Messaggio
	          readMessage.setText(message, messageArea);

	          senderEmail.sendEmail(message, session);
	          // Send message
	          
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	}
}
