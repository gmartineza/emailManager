import org.junit.Test;
import static org.junit.Assert.*;
import ucp.gmartineza.emailmanager.*;
public class ContactTest {
    @Test
    public void InstantiateContactsTest(){
    Contact fullContact = new Contact("mrbeast@yahoo.org", "Michael", "Jackson");
    Contact emailOnlyContact = new Contact("mrbeast@yahoo.org");
    assertNotNull(fullContact);
    assertNotNull(emailOnlyContact);
    assertNotEquals(fullContact, emailOnlyContact);
    }
}
