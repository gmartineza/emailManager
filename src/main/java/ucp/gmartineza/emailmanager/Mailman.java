package ucp.gmartineza.emailmanager;

import java.util.List;

public class Mailman {
    /** TODO: 
    createMail()
    searchMail()
    sendMail()
    **/
    public void sendMail(Mail mail){
        Contact remitent = mail.getRemitent();
        List<Contact> destinatary = mail.getDestinatary();
    }
}
