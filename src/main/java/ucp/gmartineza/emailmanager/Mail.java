package ucp.gmartineza.emailmanager;

import java.util.List;

public class Mail {
    Contact remitent;
    String subject;
    String content;
    List<Contact> destinatary;

    public Contact getRemitent() {
        return remitent;
    }

    public void setRemitent(Contact remitent) {
        this.remitent = remitent;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Contact> getDestinatary() {
        return destinatary;
    }

    public void setDestinatary(List<Contact> destinatary) {
        this.destinatary = destinatary;
    }
}
