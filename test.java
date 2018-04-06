public class test {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(4);
        list.add(5);
        list.add(2);

        list.removeCurrent();
        System.out.println(list);
    }
}
