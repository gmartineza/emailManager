package ucp.gmartineza.emailmanager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
    private String name;
    private String emailAddress;

    public Contact(String emailaddress, String name){
        if (isValidEmailAddress(emailaddress)){
            setEmailAddress(emailaddress);
        } else {
            throw new IllegalArgumentException("Contact: emailAddress is not valid.");
        }
        setName(name);
    }

    public Contact(String emailaddress){
        if (isValidEmailAddress(emailaddress)){
            setEmailAddress(emailaddress);
        } else {
            throw new IllegalArgumentException("Contact: emailAddress is not valid.");
        }
        setEmailAddress(emailaddress);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    private boolean isValidEmailAddress(String emailAddress){
        String emailaddressRegexPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailaddressRegexPattern);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }
}
