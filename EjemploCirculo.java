/*
 * Dado el centro y el radio de un círculo, 
 * determinar si un punto de R2
 * pertenece o no al interior del círculo
 * [(h,k), r, (x,y)] --->  boolean
 *
 *    (x-h)^2 + (y-k)^2 = r^2   circunferencia
 *    (x-h)^2 + (y-k)^2  <= r^2  interior del circulo
 */
package ejemplocli;

import java.util.Scanner;

public class EjemploCirculo {
    
    /**
     * 
     * @param h     coordenada x del centro del circulo
     * @param k     coordenada y del centro del circulo
     * @param radio radio del circulo
     * @param x     coordenada x del punto
     * @param y     coordenada y del punto
     * @return boolean si pertenece al circulo o no
     */
    public static boolean perteneceCirculo(double h, double k, double radio,
                                           double x, double y) {
        //boolean pertenece;
        
        return Math.pow(x-h, 2) + Math.pow(y-k, 2) <= radio*radio;
        
        
        //return pertenece;
    }
    
    // Algoritmo principal
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Lectura de datos de entrada
        System.out.println("Ingrese el centro (separado por espacio las coordenadas): ");
        double h = lector.nextDouble();
        double k = lector.nextDouble();
                
        System.out.println("Ingrese el radio: ");
        double radio = lector.nextDouble();
        
        System.out.println("Ingrese el punto (separado por espacio las coordenadas): ");
        double x = lector.nextDouble();
        double y = lector.nextDouble();
        
        //boolean pertenece = perteneceCirculo(h,k,radio, x, y);
        // if (pertenece) {
        if (perteneceCirculo(h,k,radio, x, y)) {
            System.out.println("Si pertenece al interior");
        } else {
            System.out.println("No pertenece al interior");
        }
    }
}
