/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author HP pro
 */
public class potencia {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int num = leer.nextInt();
        System.out.print("Introduce el exponente: ");
        int exponente = leer.nextInt();
        leer.close();
        System.out.printf("%n%d elevado a %d es igual a %.3f", num, exponente, potencia(num, exponente));
    }
         
    private static double potencia(int num, int exponente){
        if(exponente==0){
            return 1;
        } else if (exponente<0) {
            return potencia(num, exponente+1) / num;
        } else {
            return num * potencia(num, exponente-1);
        }
    }
}

