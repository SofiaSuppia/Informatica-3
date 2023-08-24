package Recursividad;

import java.util.Scanner;

public class MainEjercicios{
    public static void main(String[] args) {
    
        int num=0;
        int num1=0;
        int resultado=0;
        int op=0;
        Scanner consola= new Scanner (System.in);
        Ejercicios miEjercicios = new Ejercicios();
        

        /*System.out.println("Ingrese numero 2:");
        num2= consola.nextInt();*/

        do {
            System.out.println("---------- MENU DE OPCIONES ---------");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8-Salir");
            System.out.println("---------------------------------------");
            op=consola.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese numero 1:");
                    num= consola.nextInt();
                    resultado=miEjercicios.factorial(num);
                    System.out.println("El factorial de "+ num + "y el resultado es: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese numero 1:");
                    num= consola.nextInt();
                    resultado=miEjercicios.ejercicio2(num);
                    System.out.println("La suma de los primeros n enteros de"+ num + "es" + resultado);
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
            }
        } while (op!=0);
    }
}

