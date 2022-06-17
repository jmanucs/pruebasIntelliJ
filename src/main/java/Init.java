/**
 * @author Jose Manuel Calzada Sanchez
 * 
 */
public class Init {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 7;

        System.out.println("Los numeros: " + a + " " + b + " " + c);
        System.out.println(cualEsMayor(a, b, c) + " es el mayor");
    }

    /**
     * @param a
     * @param b
     * @param c
     * @return int del numero mas alto
     */
    public static int cualEsMayor(int a, int b, int c){
        if (a > b & a > c) {
            return a;
        } else if (b > a & b > c) {
            return b;
        }
            return c;
    }
}
