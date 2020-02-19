package bylinkedlist;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<Long> contactNumber;
    private String mailID;

    public String getFirstName() {
        return firstName;
    }

    public Person(String firstName, String lastName, ArrayList<Long> contactNumber, String mailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.mailID = mailID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ArrayList<Long> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMailID(String mailID) {
        this.mailID = mailID;
    }

    public String getMailID() {
        return mailID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber=" + contactNumber +
                ", mailID='" + mailID + '\'' +
                '}';
    }
}
