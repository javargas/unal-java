
package ejemplocli;

public class ejemploEpsilon {

    public static double minMaquina() {
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        while (Xi > 0.0) {
            
            System.out.println("Xi: "+ Xi);
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        System.out.println("Negativo que hizo que parara Xi: "+ Xi);
        return Xo;
    }

    public static void main(String[] args) {
        System.out.println(minMaquina());
    }
}
