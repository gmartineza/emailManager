import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import ucp.gmartineza.emailmanager.Contact;
import ucp.gmartineza.emailmanager.Mail;

public class MailTest {
    @Test
    public void SendSingleDestinataryTest(){
        Contact r = new Contact("someone@mail.com");
        Contact d = new Contact("otherone@mail.com");
        Mail mail = new Mail(r, d, "subject", "content");
    
        assertEquals(mail.getRemitent().getEmailAddress(), r.getEmailAddress());
        assertEquals(mail.getDestinatary().get(0), d);
    }

    @Test
    public void SendMultipleDestinatariesTest(){
        Contact r = new Contact("someone@mail.com");
        Contact d1 = new Contact("otherone@mail.com");
        Contact d2 = new Contact("othertwo@mail.com");
        Contact d3 = new Contact("tree@cedar.com");

        List<Contact> dList = new ArrayList<Contact>();
        dList.add(d1);
        dList.add(d2);
        dList.add(d3);

        Mail mail = new Mail(r, dList, "subject", "content");
    
        assertEquals(mail.getRemitent().getEmailAddress(), r.getEmailAddress());
        assertEquals(mail.getDestinatary(), dList);
    }
}