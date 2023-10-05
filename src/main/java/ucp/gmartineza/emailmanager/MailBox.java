package ucp.gmartineza.emailmanager;

import java.util.List;

public class Mailbox {
    List<Contact> listOfContacts;

    public List<Contact> getListOfContacts() {
        return listOfContacts;
    }

    public void setListOfContacts(List<Contact> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }
}
