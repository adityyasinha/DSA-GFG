/*
Print numbers from N to 1 (space separated) without the help of loops.
*/

public class printNto1 {
    static void printNos(int N) {
        // code here
        if (N == 0) {
            return;
        }
        System.out.print(N + " ");
        printNos(N - 1);
    }

    public static void main(String[] args) {
        int N = 10;
        printNos(N);
    }
}
