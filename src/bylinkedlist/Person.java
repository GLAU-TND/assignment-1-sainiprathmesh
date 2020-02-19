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

    public String getMailID() {
        return mailID;
    }
}
