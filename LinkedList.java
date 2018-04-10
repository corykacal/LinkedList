public class LinkedList<E> {

    private Node head;
    private Node tail;

    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(E data) {
        if(head==null) {
            this.head = new Node(tail,data,tail);
            this.tail = head;
        } else {
            //adding to end (Head, data, data, Tail, data->Head)
            Node nextNode = new Node(tail,data,head);
            //tail now prints to new tail
            tail.next = nextNode;
            //new tail is added node
            tail = nextNode;
        }
        size++;
    }

    //NEED TO DO
    //more elegant solution
    public void removeCurrent() {
        if(head!=null) {
            if(size==1) {
                head = null;
                tail = null;
            } else {
                Node prevNode = tail.previous;
                Node nextNode = tail.next;
                prevNode.next = nextNode;
                tail = prevNode;
            }
        }
    }

    public E getCurrent() {
        E result = (E) tail.data;
        return result;
    }


    public boolean remove(E data) {
        Node target = find(data);
        if(target==null) {
            return false;
        } else {
            Node temp = tail;
            tail = target;
            removeCurrent();
            tail = temp;
            return true;
        }
    }

    public boolean contains(E data) {
        Node target = find(data);
        if(target==null) {
            return false;
        } else {
            return true;
        }
    }

    private Node find(E data) {
        if(head==null) {
            return null;
        }
        Node result = null;
        Node current = head;
        boolean found = false;
        do {
            if(current.data==data) {
                result = current;
                found = true;
            } else {
                current = current.next;
            }
        } while(current!=head && !found);
        return result;
    }

    public int size() {
        return this.size;
    }

    //need to make standard and more readable
    public String toString() {
        String result = "";
        Node current = head;
        do {
            result+= current.getData() + ", ";
            current = current.next;
        } while(current!=head);
        return result;
    }

    private class Node<E> {

        private Node next;
        private Node previous;
        private E data;

        public Node(Node previous, E data, Node next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

        public Node getNext() {
            return this.next;
        }

        public Node getPrev() {
            return this.previous;
        }

        public E getData() {
            return this.data;
        }

    }

}

