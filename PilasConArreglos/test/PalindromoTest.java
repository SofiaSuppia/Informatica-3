package test;
import utils.Stack;

public class PalindromoTest {
    // Función para eliminar espacios y convertir a minúsculas
    public static String procesarCadena(String input) {
        String procadena = input.replaceAll("\\s", "").toLowerCase();
        return procadena;
    }

    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String str) {
        String procad = procesarCadena(str);
        int tam = procad.length();
        return false;
    }

    

}  
