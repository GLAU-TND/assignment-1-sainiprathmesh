package bylinkedlist;

public class Definition<E> implements ADT<E> {

    private Node head = null;
    private int size = 0;

    private Node getNode(int index) {
        Node response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    @Override
    public void add(Person data) {

    }

    @Override
    public void remove(Person data) {

    }

    @Override
    public Person search(String firstName) {
        return null;
    }

    @Override
    public void print() {

    }
}
