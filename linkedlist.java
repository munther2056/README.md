public class linkedlist {
        private Node<T> head;
    private Node<T> current;

    public linkedlist() {
        head = current = null;
    }

    public boolean empty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void findFirst() {
        current = head;
    }

    public void findNext() {
        current = current.next;
    }

    public T retrieve() {
        return current.data;
    }

    public void update(T item) {
        current.data = item;
    }

    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;

            while (tmp.next != current)
                tmp = tmp.next;

            tmp.next = current.next;
        }

        if (current.next == null)
            current = head;
        else
            current = current.next;
    }

    public boolean last() {
        return current.next == null;
    }

    public void insert(T val) {
        Node<T> tmp;
        if (empty()) {
            current = head = new Node<T>(val);
        } else {
            tmp = current.next;
            current.next = new Node<T>(val);
            current = current.next;
            current.next = tmp;
        }
    }
    
}
