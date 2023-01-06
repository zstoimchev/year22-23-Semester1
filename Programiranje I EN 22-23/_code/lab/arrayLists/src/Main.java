import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Hello");
        stringArray.add(0, "World");
        System.out.println(stringArray);
        for (int i = 0; i < stringArray.size(); i++) {
            System.out.print(stringArray.get(i)+" ");
        }
        stringArray.remove(0);
        System.out.print(stringArray);
        System.out.println();
        System.out.println();

        ArrayList<Integer> arr = createList1(5);
        Dby5(arr);

    }
    //create arraylist with n elements
    public static ArrayList<Integer> createList1(int n){
        ArrayList<Integer> L = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            L.add(sc.nextInt());
        }
        return L;
    }

    //method for exercise 1
    public static void Dby5(ArrayList<Integer> l){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i)%5==0)
                newList.add(l.get(i));
        }
        Collections.sort(newList);
        System.out.println(newList);
    }
}