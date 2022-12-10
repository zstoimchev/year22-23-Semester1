import javax.lang.model.util.ElementScanner6;

public class live {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        int y = sum(5);
        int z = recursive(5);
        System.out.println("sum : rec");
        System.out.println(y + "  : " + z);*/

        int n=50;
        int i=n+1;
        int memo[] = new int[n+1];

        System.out.println(fib(50, memo));
    }

    public static int fib(int n, int[] memo) {
        if (n == 0 || n == 1)
            return 1;
        else if (memo[n] == 0 ){        //not computed yet
            memo[n] = fib(n-1, memo) + fib(n-2, memo);
            return memo[n];

        }
        else 
            return memo[n];     //return from memo
    }

    // defining recursion function
    public static int recursive(int x) {
        if (x == 0)
            return x;
        else
            return x + recursive(x - 1);
    }

    // defining function
    public static int sum(int x) { // public for no restrictions and static for no owner
        int res = 0;
        for (int i = 0; i <= x; i++) {
            res = res + i;
        }
        return res;
    }

}

// exit as return 0, the scack in non-empty
// exit as return 0, stack in empty
// fibonacci is recursive with first two elements 0 and 1

//MEMOIZATION!! check xD


//if 50%
//for loop 75%
//combined 100%