package ejemplocli;

import java.util.Scanner;

/**
 * Calcular el valor de 2 elevado a la potencia n.
 */
public class EjemploWhile2 {

    public static double  potencia2While(int n){
        double potencia = 1;
        
        while (n > 0) { // condicion de parada
            potencia *= 2;
            n--;  // actualizacion (Cambio)
        }
        
        return potencia;
    }
    
    
    public static double  potencia2For(int n){
        double potencia = 1;
        
        for (int i = 0; i < n; i++) {  // inicio; condicion; cambio
            potencia *= 2;
        }
        
        return potencia;
    }
    
    
    public static double  potencia2R(int n){ // inicio
        if (n == 0) {  // condicion de parada
            return 1;
        } else {
            return 2*potencia2R(n-1); // cambio
        }
    }
    
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        int n = lector.nextInt();
        
        System.out.println("potencia2While: " + potencia2While(n));
        System.out.println("potencia2For: " + potencia2For(n));
        System.out.println("potencia2R: " + potencia2R(n));
        
        
    }
}
