import org.junit.Test;
import static org.junit.Assert.*;
import ucp.gmartineza.emailmanager.*;
public class ContactTest {
    @Test
    public void InstantiateContactsTest(){
    Contact fullContact = new Contact("mrbeast@yahoo.org", "Michael Jackson");
    Contact emailOnlyContact = new Contact("mrbeast@yahoo.org");
    assertEquals("mrbeast@yahoo.org", fullContact.getEmailAddress());
    assertEquals("Michael Jackson", fullContact.getName());
    assertEquals("mrbeast@yahoo.org", emailOnlyContact.getEmailAddress());
    }

    @Test (expected = IllegalArgumentException.class)
    public void InvalidContactTest(){
        Contact contact = new Contact("google.com");
        assertNull(contact);
    }
}
