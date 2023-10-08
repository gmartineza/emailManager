package ucp.gmartineza.emailmanager;

import java.util.List;

public class Mail {
    Contact remitent;
    List<Contact> destinatary;
    String subject;
    String content;

    public Mail(Contact remitent, List<Contact>destinatary, String subject, String content){
        setRemitent(remitent);
        setDestinatary(destinatary);
        setSubject(subject);
        setContent(content);
    }

    public Mail(Contact remitent, Contact destinatary, String subject, String content){
        setRemitent(remitent);
        addDestinatary(destinatary);
        setSubject(subject);
        setContent(content);
    }

    private void addDestinatary(Contact destinatary) {
        this.destinatary.add(destinatary);
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

    public List<Contact> getDestinatary() {
        return destinatary;
    }

    public void setDestinatary(List<Contact> destinatary) {
        this.destinatary = destinatary;
    }
}
