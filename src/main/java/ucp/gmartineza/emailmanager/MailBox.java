package ucp.gmartineza.emailmanager;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private Contact owner;
    private List<Mail> mails = new ArrayList<>();
    private boolean isInbox;

    public MailBox(Contact owner, List<Mail> mails, boolean isInbox){
        setOwner(owner);
        setMails(mails);
        setIsInbox(isInbox);
    }

    public MailBox(Contact owner, boolean isInbox){
        setOwner(owner);
        setIsInbox(isInbox);
    }

    public Contact getOwner() {
        return owner;
    }

    private void setOwner(Contact owner) {
        this.owner = owner;
    }

    public List<Mail> getMails() {
        return mails;
    }

    public void setMails(List<Mail> mails) {
        this.mails = mails;
    }

    public void addMail(Mail mail){
        this.mails.add(mail);
    }

    public boolean isInbox() {
        return isInbox;
    }

    private void setIsInbox(boolean isInbox) {
        this.isInbox = isInbox;
    }
}
