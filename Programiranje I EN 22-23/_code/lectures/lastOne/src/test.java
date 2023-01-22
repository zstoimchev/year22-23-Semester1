public class test {
    public static void main(String[] args) {

        int a = 7;
        int middle = a / 2;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(j>=middle)
                    break;
                if (a - j - 1 == j || j >= middle - i && j <= middle + i)//|| a-i-1==i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();


        }
    }
}