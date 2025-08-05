/*
Given three distinct numbers a, b and c. Find the number with a value in the middle
*/
public class middleOfThree {
     int middle(int a, int b, int c) {
        
        if ((b < a && a < c) || (c < a && a < b)) {
            return a;
        } else if ((a < b && b < c) || (c < b && b < a)) {
            return b;
        } else {
            return c;
        }
    }
}
