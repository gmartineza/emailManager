import org.junit.Test;

import ucp.gmartineza.emailmanager.Contact;
import ucp.gmartineza.emailmanager.Mail;
import ucp.gmartineza.emailmanager.MailBox;
import ucp.gmartineza.emailmanager.Mailman;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MailmanTest {
    @Test
    public void sendMailTest() {
        Contact r = new Contact("someone@mail.com");
        Contact d1 = new Contact("otherone@mail.com");
        Contact d2 = new Contact("othertwo@mail.com");

        List<Contact> dList = new ArrayList<Contact>();
        dList.add(d1);
        dList.add(d2);

        MailBox rIB = new MailBox(r,true);
        MailBox rOB = new MailBox(r,false);
        MailBox d1IB = new MailBox(d1,true);
        MailBox d1OB = new MailBox(d1,false);
        MailBox d2IB = new MailBox(d2,true);
        MailBox d2OB = new MailBox(d2,false);

        List<MailBox> mailBoxes = new ArrayList<MailBox>();
        mailBoxes.add(rIB);
        mailBoxes.add(rOB);
        mailBoxes.add(d1IB);
        mailBoxes.add(d1OB);
        mailBoxes.add(d2IB);
        mailBoxes.add(d2OB);

        Mail mail1 = new Mail(r, dList, "subject1", "content1");
        Mailman mailman = new Mailman(mailBoxes);
        assertNotNull(mailman.getMailBoxes());
        mailman.sendMail(mail1);
    }

    @Test (expected = NoSuchElementException.class)
    public void failToSendMailTest() {
        Contact r = new Contact("someone@mail.com");
        Contact d1 = new Contact("otherone@mail.com");
        Contact d2 = new Contact("othertwo@mail.com");

        List<Contact> dList = new ArrayList<Contact>();
        dList.add(d1);
        dList.add(d2);

        MailBox rIB = new MailBox(r,true);
        MailBox rOB = new MailBox(r,false);
        MailBox d1IB = new MailBox(d1,true);
        MailBox d1OB = new MailBox(d1,false);
        //MailBox d2IB = new MailBox(d2,true);
        //MailBox d2OB = new MailBox(d2,false);

        List<MailBox> mailBoxes = new ArrayList<MailBox>();
        mailBoxes.add(rIB);
        mailBoxes.add(rOB);
        mailBoxes.add(d1IB);
        mailBoxes.add(d1OB);
        //mailBoxes.add(d2IB);
        //mailBoxes.add(d2OB);

        Mail mail1 = new Mail(r, dList, "subject1", "content1");
        Mailman mailman = new Mailman(mailBoxes);
        assertNotNull(mailman.getMailBoxes());
        mailman.sendMail(mail1);
    }
}