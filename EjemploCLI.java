
package ejemplocli;

import java.util.Scanner;

public class EjemploCLI {

    // Algoritmo principal
    public static void main(String[] args) {
        
        // Lectura de datos (CLI) System.in
        Scanner lector = new Scanner(System.in);        
                
        // Salida de datos (CLI) System.out
        System.out.print("Ingrese su nombre: ");
        
        String nombre = lector.nextLine();  // leo la cadena completa
        
        System.out.print("Ingrese su año de nacimiento: ");
        
        // equivalente a : Integer.parseInt(lector.next())  3 6 7 pedro gomez
        int birthyear = lector.nextInt();
        
        // esta instruccion lee toda la linea y la convierte a entero
        // Integer.parseInt(lector.nextLine())
        
        int edad = 2021 - birthyear;
        
        System.out.println("La edad es: " + edad);
    }
    
}
