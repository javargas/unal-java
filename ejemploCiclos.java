package ejemplocli;

public class ejemploCiclos {

    public static void main(String[] args) {

        int i = 0;
        while (i <= 6) {
            System.out.println(i++);
            // i++ primero evalua, despues incremente
            // ++i primero incremente despues evalua
        }

         i = 2; // inicializa a i en 2
        int j = 25; // inicializa a j en 25
        while (i < j) { // mientras i sea menor a j
            // imprime los valores de i y j
            System.out.println(i + ", " + j);
            i = i * 2; // i se mult ́ıplica por 2 en cada paso
            j = j + 10; // se incrementa de 10 en 10
        }
        // se ejecuta al terminar el ciclo
        System.out.println("the end.");
        System.out.println(i + ", " + j);// valores finales de i y j
    }
}
// i,j
// 2,25
// 4,35
// 8,45
// 16,55 
// 32,65
// 64,75  <<-- Parada
// 128, 85