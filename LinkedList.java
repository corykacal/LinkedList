public class LinkedList<E> {

    private Node root;
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

