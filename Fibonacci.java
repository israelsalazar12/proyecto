
package fibonacci;


/**
 *
 * @author HP pro
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(fibonacciRe(6));
    }
     public static int fibonacciRe(int n) {
 

        if (n == 0) {
            return 0;
                
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRe(n - 1)+(n - 2);
        }
 
     }
}

