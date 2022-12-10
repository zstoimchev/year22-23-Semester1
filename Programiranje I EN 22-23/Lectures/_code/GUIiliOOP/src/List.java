public class List {
    int head;
    List tail;

    public void insert(int element) {
        if (tail == null) {
            tail = new List();
            tail.head = element;
        } else {
            tail.insert(element);
        }
    }

    public void print(){
        System.out.print(head + " ");
        if(tail!=null)
            tail.print();
    }

    public boolean delete(int element) {
        if (tail == null) {    //if we are the last element{
            return false;
        } else if (tail.head == element) { //we're deleting my tail
            tail = tail.tail;
            return true;
        } else {

            return tail.delete(element);
        }
    }

    public boolean search(int element) {
        if (head == element) {  //im her
            return true;
        } else {
            if (tail == null) { //im last
                return false;
            } else {
                return tail.search(element);
            }
        }

    }
}
