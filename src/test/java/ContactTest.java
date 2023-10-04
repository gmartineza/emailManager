import org.junit.Test;
import static org.junit.Assert.*;
import ucp.gmartineza.emailmanager.*;
public class ContactTest {
    @Test
    public void InstantiateContactTest(){
    Contact contact = new Contact("gabymartinezalarcon@gmail.com", "Gabriel", "Martinez");
    assertNotNull(contact);
    }
}
