
package ejemplocli;

import java.util.Scanner;
public class EjercicioPalindroma {
    
    public static String invertir(String cadena) {
        String respuesta = "";
        
        // for (int i = 0; i < cadena.length(); i++)
        // for (String letra: cadena.split(""))
        for (char letra : cadena.toCharArray()) {
            respuesta = letra + respuesta;
        }
        
        return respuesta;
    }
    
    public static boolean esPalindroma(String cadena) {
        return cadena.equals(invertir(cadena));
    }
    
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el texto: ");
        
        String entrada = lector.nextLine();
        
        System.out.println("Inversa: " + invertir(entrada));
        System.out.println("Es palindroma: " + esPalindroma(entrada));        
    }
}
