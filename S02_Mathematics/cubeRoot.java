// Given a number n, find the cube root of n.
// Note: We need to print the floor value of the result.


public class cubeRoot {
    static int cubeRoot(int n) {
        // code here
        double cubicRoot = Math.cbrt (n);
        return (int) Math.floor(cubicRoot);
        
    }
}