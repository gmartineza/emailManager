import org.junit.Test;

import ucp.gmartineza.emailmanager.Contact;
import ucp.gmartineza.emailmanager.Mail;
import ucp.gmartineza.emailmanager.Mailman;

import java.util.ArrayList;
import java.util.List;

public class MailmanTest {
    @Test
    public void sendMailTest() {
        Contact remitent = new Contact("someone@mail.com");
        Contact destinatary = new Contact("otherone@mail.com");
        List<Contact> destinataries = new ArrayList<Contact>();
        destinataries.add(destinatary);

        Mail mail1 = new Mail(remitent, destinataries, "subject1", "content1");
        Mailman mailman = new Mailman();
        mailman.sendMail(mail1);
    }
}