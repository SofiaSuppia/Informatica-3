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
                    resultado=miEjercicios.ej1(num);
                    System.out.println("El factorial de "+ num + "y el resultado es: " + resultado);
                    break;
                case 2:
                    System.out.println("Ingrese numero 1:");
                    num= consola.nextInt();
                    resultado=miEjercicios.ej2(num);
                    System.out.println("La suma de los primeros n enteros de"+ num + "es" + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese un numero: ");
                    num=consola.nextInt();
                    System.out.println("Ingrese el exponente para elevar el numero: ");
                    num1=consola.nextInt();
                    resultado=miEjercicios.ej3(num,num1);
                    System.out.println(num+" elevado a "+num1+" es "+resultado);
                    break;
                case 4:
                    System.out.println("Ingrese un numero: ");
                    num=consola.nextInt();
                    System.out.println("--Cuenta regresiva de "+num+" es: --");
                    miEjercicios.ej4(num);
                    break;
                case 5:
                    System.out.println("Ingrese un numero 1: ");
                    num=consola.nextInt();
                    System.out.println("Ingrese un numero 2 para multiplicar el numero 1: ");
                    num1=consola.nextInt();
                    resultado=miEjercicios.ej5(num,num1);
                    System.out.println();
                    System.out.println(num+" multiplicado por "+num1+" es "+resultado);
                    System.out.println();
                    break;
                case 6:
                    int tamArreglo=0;
                    int i=0;
                    System.out.println("Ingrese tamaño del arreglo: ");
                    tamArreglo=consola.nextInt();
                    int[] arreglo= new int[tamArreglo];
                    System.out.println("Ingrese "+ tamArreglo + " numeros: ");
                    for(i=0;i < tamArreglo;i++){
                        arreglo[i]=consola.nextInt();
                    }
                    System.out.println("--Cuenta regresiva del arreglo--");
                    miEjercicios.ej6(arreglo,tamArreglo-1);
                    System.out.println();
                    System.out.println("--------------------------------");
                    break;
                case 7:
                    System.out.println("Ingrese un numero entero: ");
                    num=consola.nextInt();
                    int count = miEjercicios.ej7(num);
                    System.out.println("El numero de unos es la representacion binaria de "+ num + ": " + count);
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
            }
        } while (op!=0);
    }
}

