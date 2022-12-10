public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(13);
        list.insert(23);
        list.insert(321);
        list.insert(103);
        list.insert(203);
        list.insert(321);
        System.out.println(list.search(13));
        System.out.println(list.delete(13));
        System.out.println(list.search(13));
        list.print();
//        for (int i = 0; i <123456789; i++) {
//            list.insert(i);
//        }
    }
}
