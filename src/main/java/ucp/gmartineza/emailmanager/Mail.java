package ucp.gmartineza.emailmanager;

import java.util.List;

public class Mail {
    private Contact remitent;
    private List<Contact> destinatary;
    private String subject;
    private String content;

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

    public Contact getRemitent() {
        return remitent;
    }

    private void setRemitent(Contact remitent) {
        this.remitent = remitent;
    }

    public String getSubject() {
        return subject;
    }

    private void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    private void setContent(String content) {
        this.content = content;
    }

    public List<Contact> getDestinatary() {
        return destinatary;
    }

    private void setDestinatary(List<Contact> destinatary) {
        this.destinatary = destinatary;
    }

    private void addDestinatary(Contact destinatary) {
        this.destinatary.add(destinatary);
    }
}
