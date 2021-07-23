
package ejemplocli;

import java.util.Scanner;
public class EjercicioUnicos {
    
    /**
     * Algorithm to determine if a string has all unique characters
     * 
     * @param cadena
     * @return True si los caracteres con unicos. False en caso contrario
     */
    public static boolean sonUnicos(String cadena) {
               
        for (String letra : cadena.split("")) {
            String sinLetra = cadena.replaceFirst(letra, "");
            //System.out.println(letra + " sinLetra: " + sinLetra);
            if (sinLetra.contains(letra)) {
                return false;
            } 
        }
            
        return true;
    }
    
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el texto: ");
        
        String entrada = lector.nextLine();
        
        System.out.println("Es Unique: " + sonUnicos(entrada));        
    }
}
