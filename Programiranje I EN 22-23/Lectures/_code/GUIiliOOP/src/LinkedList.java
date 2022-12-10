public class LinkedList {
    List first;
    List last;

    public void insert(int element) {

        if (first == null) {
            first = new List();
            first.head = element;
        } else {
            last = new List();
            last.head = element;
            last = last.tail;
        }


//        if (first == null) {
//            first = new List();
//            first.head = element;
//        } else
//            first.insert(element);
    }

    public void print() {
        if (first == null) {
            System.out.println("List is empty");
        } else {
            first.print();
        }
    }

    public boolean delete(int element) {
        if (first == null) {
            return false;
        } else if (first.head == element) {    //delete first element
            first = first.tail;
            return true;
        } else {
            return first.delete(element);
        }
    }


    public boolean search(int element) {
        if (first == null) {    //empty
            return false;
        } else {
            return first.search(element);
        }

    }
}
