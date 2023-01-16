public class Main {
    public static void main(String[] args) {
        final String name = "Zhivko Stoimchev";
        System.out.println("Original: "+name);
        System.out.print("Reversed: ");
        for (int i = name.length()-1; i>=0; i--) {
            System.out.print(name.charAt(i));
        }

        //alternative reversed with string builder
        System.out.println("\n\nReversed: " + new StringBuilder(name).reverse().toString());

    }
}
