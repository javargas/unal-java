package ejemplocli;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos números separados por espacio: ");
        int num = sc.nextInt();
        int den = sc.nextInt();
        
        double m = (double)num / den;
        System.out.println("Resultado: " + m);
        
        double pi = 3.1415;
        int pi_entero = (int)pi;
        double x = 1.0;
        double y = -2.5;
        int n = (int)x;
        int m2 = (int)y;
        int p = (int)3.14159265;
        
        
    }
}
