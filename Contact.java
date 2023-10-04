public class Contact {
    String name;
    String surname;
    String emailAddress;

    public Contact(String name, String surname, String emailAdress){
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAdress;
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
    public void setEmailAdress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailAdress() {
        return emailAddress;
    }
}
