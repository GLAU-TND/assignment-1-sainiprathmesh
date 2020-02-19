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

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Long> getContactNumber() {
        return contactNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNumber(ArrayList<Long> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setMailID(String mailID) {
        this.mailID = mailID;
    }

    public String getMailID() {
        return mailID;
    }
}
