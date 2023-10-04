package emailmanager;

import java.util.List;

public class MailBox {
    List<Contact> listOfContacts;

    public List<Contact> getListOfContacts() {
        return listOfContacts;
    }

    public void setListOfContacts(List<Contact> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }
}
