package ejemplocli;

import java.util.Scanner;

public class EjemploFuncion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //double d = Double.parseDouble(sc.nextLine());
        double d = sc.nextDouble();
        System.out.println(f(d));
    }

    public static double f(double x) {
        return Math.pow(x, 2);
    }
}
