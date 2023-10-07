import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

import ucp.gmartineza.emailmanager.Contact;
import ucp.gmartineza.emailmanager.Mail;

public class MailTest {
    @Test
    public void SendSingleDestinataryTest(){
        Contact remitent = new Contact("someone@mail.com");
        Contact destinatary = new Contact("otherone@mail.com");
        ArrayList<Contact> destinataries = new ArrayList<Contact>();
        destinataries.add(destinatary);
        Mail mail = new Mail(remitent, destinataries, "subject", "content");
    
        assertEquals(mail.getRemitent().getEmailAddress(), remitent.getEmailAddress());
    }
}