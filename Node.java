public class Node <T>{
	public T data;
    public Node<T> next;

    public Node() {
        data = null;
        next = null;
    }

    public Node(T value) {
        data = value;
        next = null;
    }
    public void setNext(T newNode) {
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
    

    

}