/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

/**
 *
 * @author HP pro
 */
public class FibonacciRe {
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



