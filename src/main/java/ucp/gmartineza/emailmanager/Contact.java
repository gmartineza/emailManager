package ucp.gmartineza.emailmanager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
    String name;
    String surname;
    String emailAddress;

    public Contact(String emailAdress, String name, String surname){
        if (isValidEmailAddress(emailAdress)){
            this.emailAddress = emailAdress;
        } else {
            throw new IllegalArgumentException("getWidth(): Piece orientation is not set or is empty.");
        }
        this.name = name;
        this.surname = surname;
    }

    public Contact(String emailAdress){
        this.emailAddress = emailAdress;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private boolean isValidEmailAddress(String emailAddress){
        String emailAdressRegexPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailAdressRegexPattern);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}
