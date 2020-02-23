package bylinkedlist;

import java.util.LinkedList;

public class Person {
    private String firstName;
    private String lastName;
    private LinkedList<String> contacts;
    private String mailID;

    public Person(String firstName, String lastName, LinkedList<String> contacts, String mailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = contacts;
        this.mailID = mailID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LinkedList<String> getContacts() {
        return contacts;
    }

    public void setContacts(LinkedList<String> contacts) {
        this.contacts = contacts;
    }

    public String getMailID() {
        return mailID;
    }

    public void setMailID(String mailID) {
        this.mailID = mailID;
    }
}
