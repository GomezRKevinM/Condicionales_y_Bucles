package ForthClass;

import java.util.InputMismatchException;
import java.util.Scanner;

// Objetivo: Imprimir la tabla de multiplicar de el numero que nos entregue el usuario.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberWrite;

        System.out.println("Introduzca un numero entero y el programa le devolvera su tabla de multiplicar");
        try{
            numberWrite = input.nextInt();
            showTable(numberWrite);
        }catch(InputMismatchException e){
            System.out.println("El valor que has ingresado no es un numero entero, por ende no se puede ralizar el proceso, sorry :c");
        }
    }

    public static void showTable(int numero){
        int i = 1;
        while (i <= 10){
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}
