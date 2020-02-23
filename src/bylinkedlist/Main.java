package bylinkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Prathmesh", "saini", (long) 991932000, "sainiprathmesh@gmail.com");
        LinkedList<Person> ls = new LinkedList<Person>();
        ls.add(person);
        System.out.println(ls.get(0));
    }
}
