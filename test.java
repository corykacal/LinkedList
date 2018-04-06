public class test {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(9);
        list.add(94);
        list.add(33);

        System.out.println(list);

       list.remove(5);
        
        System.out.println(list);
    }
}
