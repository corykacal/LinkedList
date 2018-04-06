public class node<E> {

    private node next;
    private node previous;
    private E data;

    public node(node previous, E data, node next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    public node getNext() {
        return this.next;
    }

    public node getPrev() {
        return this.previous;
    }

    public E getData() {
        return this.data;
    }

}

