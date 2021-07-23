package ejemplocli;

import java.util.Scanner;

public class EjemploAbsoluto {

    public static double valorAbsoluto(double x) {
        double valor;
        if (x >= 0) {
            valor = x;
        } else {
            valor = -x;
        }
        return valor;
    }

    public static double valorAbsoluto2(double x) {
        double valor;
        valor = (x >= 0) ? x : -x;
        return valor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.print("Ingrese un n ́umero x: ");
        x = sc.nextDouble();
        System.out.println("El valor absoluto de "
                + x + " es " + valorAbsoluto2(x));

    }
}
