package ucp.gmartineza.emailmanager;

import java.util.List;

public class MailBox {
    Contact mailBoxOwner;
    List<Mail> mails;

    public Contact getMailBoxOwner() {
        return mailBoxOwner;
    }

    private void setMailBoxOwner(Contact mailBoxOwner) {
        this.mailBoxOwner = mailBoxOwner;
    }

    public List<Mail> getMails(){
        return mails;
    }

    private void setMails(List<Mail> mails) {
        this.mails = mails;
    }

    public MailBox(Contact mailBoxOwner, List<Mail> mails){
        setMailBoxOwner(mailBoxOwner);
        setMails(mails);
    }
}
