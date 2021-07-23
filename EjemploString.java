package ejemplocli;
import java.util.Scanner;

public class EjemploString {

    public static void main(String args[]) {
        String a = "test";
        String b = "test";
        String c = "HOLA";
        
       
        // Al objeto a le envio el mensaje "equals" para que se compare con b
        // a.equals(b)    
        System.out.println(a == b); // true (esperaba falso porque son dos variables)
        System.out.println(a == c);  // false
        System.out.println(a.equals(a));  // true
        System.out.println(a.equals(b));  // true compara valores
        System.out.println(a.equals(c));  // false
        System.out.println(a.equalsIgnoreCase(c)); // true
        
        Scanner sc = new Scanner(System.in);
        // lee cadena 1
        String miCadena1 = sc.nextLine();
        // lee cadena 2
        String miCadena2 = sc.nextLine();
        // Imprime true o false
        System.out.println("equals: " + miCadena1.equals(miCadena2));
        System.out.println(" == : " + (miCadena1 == miCadena2));
        
        System.out.println("unhappy".substring(2));
        System.out.println("Harbison".substring(3));
        
        int prueba = 9 / 2;
        
        
    }
}
