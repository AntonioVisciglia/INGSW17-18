package facade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import com.sun.mail.smtp.SMTPTransport;

public class SenderEmail {
	public void sendEmail(MimeMessage m, Session s) {
        try {
        	File f = new File("resource/boh.txt");
        	Scanner sc;
        	String string = " ";
			try {
				sc = new Scanner(f);
				string = sc.nextLine();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        	SMTPTransport t = (SMTPTransport)s.getTransport("smtps");
			t.connect("smtp.gmail.com", "antonio01.visciglia@gmail.com", string);
			t.sendMessage(m, m.getAllRecipients());      
			t.close();
			JOptionPane.showMessageDialog(null, "Email inviata con successo.");
		} catch (MessagingException e) {
			JOptionPane.showMessageDialog(null, "Errore durante l'invio della mail.\n"
					+ "1-> Controlla l'email di destinazione\n"
					+ "2-> Controlla se hai connessione\n"
					+ "3-> Controlla se hai consentito l'accesso alle app sconosciute.");
		}
	}
}
