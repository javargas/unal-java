
package ejemplocli;


public class EjercicioVolumen {
    
        /* python    java
         * 9//2  ==> 9/2   --> 4
         * 9/2   ==> 9.0/2   (double)9/2  --> 4.5
         */
    
    public static double volumenEsfera(double r){
        return 4 * Math.PI * Math.pow(r, 3) / 3;
    }
    
    public static double volumenCono(double r, double h){
        return Math.PI * Math.pow(r, 2) * h / 3;
    }
    
    public static void main(String args[]) {
        double r1 = 3, r2 = 4;
        double h = 9/2;   // 4.0
        
        double v = volumenEsfera(r1) + volumenCono(r2, h);
        
        System.out.println("Volumen: " + v);
        
    }
}
// real (4.5) 188.49
// entero (4) 180.11