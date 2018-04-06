public class LinkedList<E> {

    //change to tail
    private Node root;
    //change to head or make a new head node instance
    private Node cur;

    public LinkedList() {
        this.root = null;
        this.cur = null;
    }

    public void add(E data) {
        if(root==null) {
            this.root = new Node(null,data,null);
            this.cur = root;
        } else {
            Node nextNode = new Node(cur,data,root);
            cur.next = nextNode;
            cur = nextNode;
        }
    }

    //NEED TO DO
    //check if cur is null or root not init or if cur is only list item.. etc
    public void removeCurrent() {
        Node prevNode = cur.previous;
        Node nextNode = cur.next;
        prevNode.next = nextNode;
        cur = prevNode;
    }

    public E getCurrent() {
        E result = (E) cur.data;
        return result;
    }


    public void remove(E data) {
        Node temp = cur;
        //check if find is null
        Node target = find(data);
        cur = target;
        removeCurrent();
        cur = temp;
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
        Node result = null;
        Node current = root;
        boolean found = false;
        do {
            if(current.data==data) {
                result = current;
                found = true;
            } else {
                current = current.next;
            }
        } while(current!=root && !found);
        return result;
    }

    //need to make standard and more readable
    public String toString() {
        String result = "";
        Node current = root;
        do {
            result+= current.getData() + ", ";
            current = current.next;
        } while(current!=root);
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

