/******************************************************************************
 *  Compilation:  javac Harmonic.java
 *  Execution:    java Harmonic n
 *  
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 *
 * @author adesh varma
 *version: 1.0
 * status: 14- 08-2017
 *
 ******************************************************************************/

public class Harmonic { 

    // returns 1/1 + 1/2 + 1/3 + ... + 1/n
    public static double harmonic(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) { 
        for (int i = 0; i < args.length; i++) {
            int arg = Integer.parseInt(args[i]);
            double value = harmonic(arg);
            StdOut.println(value);
        }
    }

}
