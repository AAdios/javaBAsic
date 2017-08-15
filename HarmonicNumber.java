/******************************************************************************
 *  Compilation:  javac HarmonicNumber.java
 *  Execution:    java HarmonicNumber n
 *  
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 * 
 * @author adesh varma
 *version: 1.0
 * status: 14- 08-2017
 ******************************************************************************/

public class HarmonicNumber { 
    public static void main(String[] args) { 

        // command-line argument
        int n = Integer.parseInt(args[0]);

        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        // print the nth harmonic number
        System.out.println(sum);
    }

}
