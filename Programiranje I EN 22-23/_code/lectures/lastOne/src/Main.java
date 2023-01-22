public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 7;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(((i + j) % a) + 1);
            }
            System.out.println();
        }
    }
}