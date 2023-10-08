import org.junit.Test;

import ucp.gmartineza.emailmanager.Contact;
import ucp.gmartineza.emailmanager.Mail;
import ucp.gmartineza.emailmanager.MailBox;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MailBoxTest {
    @Test
    public void InstantiateMailBoxTest() {
        Contact remitent = new Contact("someone@mail.com");
        Contact destinatary = new Contact("otherone@mail.com");
        List<Contact> destinataries = new ArrayList<Contact>();
        destinataries.add(destinatary);

        Mail mail1 = new Mail(remitent, destinataries, "subject1", "content1");
        Mail mail2 = new Mail(remitent, destinataries, "subject2", "content2");

        List<Mail> mails = new ArrayList<>();
        mails.add(mail1);
        mails.add(mail2);

        MailBox outBox = new MailBox(remitent, mails, false);
        
        assertNotNull(outBox);
    }
}
