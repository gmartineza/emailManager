import org.junit.Test;

import ucp.gmartineza.emailmanager.Contact;
import ucp.gmartineza.emailmanager.Mail;
import ucp.gmartineza.emailmanager.Filter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    @Test
    public void filterBySubjectTest() {
        Mail m1 = new Mail(new Contact("a@mail.com"),
                           new ArrayList<>(),
                           "Sunday meeting",
                           "content");
        Mail m2 = new Mail(new Contact("b@mail.com"),
                           new ArrayList<>(),
                           "Friday meeting",
                           "second content");

        List<Mail> mails = new ArrayList<>();
        mails.add(m1);
        mails.add(m2);

        List<Mail> expectedMails = Filter.applyFilter(mails, Filter.filterBySubject("meeting"));

        assertEquals(mails, expectedMails);
    }

    @Test
    public void filterByContentTest(){
        Mail m1 = new Mail(new Contact("a@mail.com"),
                           new ArrayList<>(),
                           "Sunday meeting",
                           "content");
        Mail m2 = new Mail(new Contact("b@mail.com"),
                           new ArrayList<>(),
                           "Friday meeting",
                           "second content");
        Mail m3 = new Mail(new Contact("c@mail.com"),
                           new ArrayList<>(),
                           "iunno",
                           "we do not have the capacities");

        List<Mail> actualMails = new ArrayList<>();
        actualMails.add(m1);
        actualMails.add(m2);
        actualMails.add(m3);

        List<Mail> expectedMails = Filter.applyFilter(actualMails, Filter.filterByContent("content"));
        actualMails.remove(2);

        assertEquals(actualMails, expectedMails);
    }
}

