public class Init {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 7;

        System.out.println("Los numeros: " + a + " " + b + " " + c);
        System.out.println(cualEsMayor(a, b, c) + " es el mayor");
    }

    public static int cualEsMayor(int a, int b, int c){
        if (a > b & a > c) {
            return a;
        } else if (b > a & b > c) {
            return b;
        }
            return c;
    }
}
