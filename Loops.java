public class Loops {
    public static void main(String[] args) {
        int n = 0;
        while (n < 5) {
            System.out.println("Hello Mofos (WHILE LOOP)");
            n++;
        }
        for (int i = 1; i <= 5; i++) {
            for (int a = 1; a <= 5; a++) {
                if (i > 1 && i < 5 && a > 1 && a < 5)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
