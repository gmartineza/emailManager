import org.junit.Test;
import static org.junit.Assert.*;
import emailmanager.*;
public class ContactTest {
    @Test
    public void InstantiateContactTest(){
    Contact contact = new Contact("gabymartinezalarcon@gmail.com", "Gabriel", "Martinez");
    assertNotNull(contact);
    }
}
