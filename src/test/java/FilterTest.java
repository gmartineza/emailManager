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
                           "search",
                           ".");
        Mail m2 = new Mail(new Contact("b@mail.com"),
                           new ArrayList<>(),
                           "search",
                           ".");
        Mail m3 = new Mail(new Contact("c@mail.com"),
                           new ArrayList<>(),
                           "Previa eterna",
                           "reunión");

        List<Mail> actualMails = new ArrayList<>();
        actualMails.add(m1);
        actualMails.add(m2);
        actualMails.add(m3);

        List<Mail> expectedMails = Filter.applyFilter(actualMails, Filter.filterBySubject("search"));
        actualMails.remove(m3);

        assertEquals(actualMails, expectedMails);
    }

    @Test
    public void filterByContentTest(){
        Mail m1 = new Mail(new Contact("a@mail.com"),
                           new ArrayList<>(),
                           ".",
                           "search");
        Mail m2 = new Mail(new Contact("b@mail.com"),
                           new ArrayList<>(),
                           ".",
                           "search");
        Mail m3 = new Mail(new Contact("c@mail.com"),
                           new ArrayList<>(),
                           ".",
                           ".");

        List<Mail> actualMails = new ArrayList<>();
        actualMails.add(m1);
        actualMails.add(m2);
        actualMails.add(m3);

        List<Mail> expectedMails = Filter.applyFilter(actualMails, Filter.filterByContent("search"));
        actualMails.remove(2);

        assertEquals(actualMails, expectedMails);
    }

    @Test
    public void filterByRemitentTest() {
        Mail m1 = new Mail(new Contact("search@mail.com"),
                           new ArrayList<>(),
                           "s",
                           "c");
        Mail m2 = new Mail(new Contact("search@mail.com"),
                           new ArrayList<>(),
                           "s",
                           "c");
        Mail m3 = new Mail(new Contact("c@mail.com"),
                           new ArrayList<>(),
                           "s",
                           "c");

        List<Mail> actualMails = new ArrayList<>();
        actualMails.add(m1);
        actualMails.add(m2);
        actualMails.add(m3);

        List<Mail> expectedMails = Filter.applyFilter(actualMails, Filter.filterByRemitent("search@mail.com"));
        actualMails.remove(2);

        assertEquals(actualMails, expectedMails);
    }

    @Test
    public void filterByDestinataryTest() {
        Mail m1 = new Mail(new Contact("a@mail.com"),
                           new Contact("search@mail.com"),
                           "s",
                           "c");
        Mail m2 = new Mail(new Contact("a@mail.com"),
                           new Contact("search@mail.com"),
                           "s",
                           "c");
        Mail m3 = new Mail(new Contact("c@mail.com"),
                           new Contact("d@mail.com"),
                           "s",
                           "c");

        List<Mail> actualMails = new ArrayList<>();
        actualMails.add(m1);
        actualMails.add(m2);
        actualMails.add(m3);

        List<Mail> expectedMails = Filter.applyFilter(actualMails, Filter.filterByDestinatary("search@mail.com"));
        actualMails.remove(2);

        assertEquals(actualMails, expectedMails);
    }

    @Test
    public void filterBySubjectOrContentTest() {
        Mail m1 = new Mail(new Contact("a@mail.com"),
                           new ArrayList<>(),
                           "search",
                           ".");
        Mail m2 = new Mail(new Contact("a@mail.com"),
                           new ArrayList<>(),
                           ".",
                           "search");
        Mail m3 = new Mail(new Contact("c@mail.com"),
                           new ArrayList<>(),
                           ".",
                           ".");

        List<Mail> actualMails = new ArrayList<>();
        actualMails.add(m1);
        actualMails.add(m2);
        actualMails.add(m3);

        List<Mail> expectedMails = Filter.applyFilter(actualMails, Filter.filterBySubjectOrContent("search"));
        actualMails.remove(2);

        assertEquals(actualMails, expectedMails);
    }

    @Test
    public void filterBySubjectAndRemitentTest() {
        Mail m1 = new Mail(new Contact("search@mail.com"),
                           new ArrayList<>(),
                           "search",
                           ".");
        Mail m2 = new Mail(new Contact("search@mail.com"),
                           new ArrayList<>(),
                           "search",
                           ".");
        Mail m3 = new Mail(new Contact("c@mail.com"),
                           new ArrayList<>(),
                           "search",
                           ".");
        Mail m4 = new Mail(new Contact("search@mail.com"),
                           new ArrayList<>(),
                           ".",
                           ".");

        List<Mail> actualMails = new ArrayList<>();
        actualMails.add(m1);
        actualMails.add(m2);
        actualMails.add(m3);
        actualMails.add(m4);

        List<Mail> expectedMails = Filter.applyFilter(actualMails, Filter.filterBySubjectAndRemitent("search", "search@mail.com"));
        actualMails.remove(2);
        actualMails.remove(2);

        assertEquals(actualMails, expectedMails);
    }

    @Test
    public void filterByContentAndRemitentTest() {
        Mail m1 = new Mail(new Contact("search@mail.com"),
                           new ArrayList<>(),
                           ".",
                           "search");
        Mail m2 = new Mail(new Contact("search@mail.com"),
                           new ArrayList<>(),
                           ".",
                           "search");
        Mail m3 = new Mail(new Contact("c@mail.com"),
                           new ArrayList<>(),
                           ".",
                           "search");
        Mail m4 = new Mail(new Contact("search@mail.com"),
                           new ArrayList<>(),
                           ".",
                           ".");

        List<Mail> actualMails = new ArrayList<>();
        actualMails.add(m1);
        actualMails.add(m2);
        actualMails.add(m3);
        actualMails.add(m4);

        List<Mail> expectedMails = Filter.applyFilter(actualMails, Filter.filterByContentAndRemitent("search", "search@mail.com"));
        actualMails.remove(2);
        actualMails.remove(2);

        assertEquals(actualMails, expectedMails);
    }
}