package Calculadora;
import java.util.Scanner;


public class mainCalculadora {
   
    public static void main(String[] args) {
        float num1=0;
        float num2=0;
        int opcion=0;
        Calculadora miCalculadora= new Calculadora();

        Scanner consola= new Scanner (System.in);

        System.out.println("Ingrese numero 1:");
        num1= consola.nextInt();

        System.out.println("Ingrese numero 2:");
        num2= consola.nextInt();
        
        do {
            System.out.println("---MENU---");
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicacion");
            System.out.println("4-Division");
            System.out.println("5-Historial de operaciones");
            System.out.println("6-Salir");
            opcion=consola.nextInt();
            switch(opcion){
                case 1:
                    miCalculadora.suma(num1,num2);
                    break;
                case 2:
                    miCalculadora.resta(num1, num2);
                    break;
                case 3:
                    miCalculadora.multiplicacion(num1, num2);
                    break;
                case 4:
                    //sin usar excepcion
                    //miCalculadora.division(num1, num2);

                    //usando excepcion
                    try {
                        miCalculadora.division(num1, num2);
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                    break;
                case 5: 
                    break;
            }
        } while (opcion!=0);
    }

}
