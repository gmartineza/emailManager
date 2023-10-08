package ucp.gmartineza.emailmanager;

import java.util.ArrayList;
import java.util.List;

public class Mailman {
    List<MailBox> mailBoxes = new ArrayList<>();

    //public Mailman(MailBox mailBox){
    //    this.mailBoxes.add(mailBox);
    //}

    public Mailman(List<MailBox> mailBox){
        this.mailBoxes = mailBox;
    }

    public List<MailBox> getMailBoxes() {
        return mailBoxes;
    }

    //public void addMailBox(MailBox mailBox){
    //    mailBoxes.add(mailBox);
    //}

    private int searchMailBox(Contact contact, boolean isInbox){
        String emailAddress = contact.getEmailAddress();
        int position = 0;
        for (MailBox mailBox : getMailBoxes()) {
            if (mailBox.getOwner().getEmailAddress() == emailAddress && mailBox.isInbox() == isInbox) {
                return position;
            }
            position++;
        }
        return -1;
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
