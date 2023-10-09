package ucp.gmartineza.emailmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Mailman {
    private List<MailBox> mailBoxes = new ArrayList<>();

    public Mailman(List<MailBox> mailBox){
        this.mailBoxes = mailBox;
    }

    public List<MailBox> getMailBoxes() {
        return mailBoxes;
    }

    private int searchMailBox(Contact contact, boolean isInbox){
        String emailAddress = contact.getEmailAddress();
        int position = 0;
        for (MailBox mailBox : getMailBoxes()) {
            if (mailBox.getOwner().getEmailAddress() == emailAddress && mailBox.isInbox() == isInbox) {
                return position;
            }
            position++;
        }
        throw new NoSuchElementException("MailBox: did not find mailbox for params"+contact+isInbox);
    }

    public void sendMail(Mail mail){
        Contact remitent = mail.getRemitent();
        List<Contact> destinatary = mail.getDestinatary();

        int remitentOutBoxPosition = searchMailBox(remitent, false);
        MailBox mailBoxToModify = mailBoxes.get(remitentOutBoxPosition);
        mailBoxToModify.addMail(mail);
        for (Contact contact : destinatary) {
            int destinataryInBoxPosition = searchMailBox(contact, true);

            mailBoxToModify = mailBoxes.get(destinataryInBoxPosition);
            mailBoxToModify.addMail(mail);
        }
    }
}
