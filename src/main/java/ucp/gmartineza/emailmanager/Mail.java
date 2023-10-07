package ucp.gmartineza.emailmanager;

import java.util.ArrayList;

public class Mail {
    Contact remitent;
    ArrayList<Contact> destinatary;
    String subject;
    String content;

    public Mail(Contact remitent, ArrayList<Contact>destinatary, String subject, String content){
        setRemitent(remitent);
        setDestinatary(destinatary);
        setSubject(subject);
        setContent(content);
    }

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

    public ArrayList<Contact> getDestinatary() {
        return destinatary;
    }

    public void setDestinatary(ArrayList<Contact> destinatary) {
        this.destinatary = destinatary;
    }
}
