public class BitDifference {
     public static int countBitsFlip(int a, int b) {
        // code here
        int xor = a ^ b;
        int count = 0;

        while (xor != 0) {
            count += xor & 1; // check lowest bit
            xor >>= 1; // shift right
        }

        return count;
    }
}
