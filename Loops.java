public class Loops {
    public static void main(String[] args) {
        int n = 0;
        while (n < 5) {
            System.out.println("Hello Mofos (WHILE LOOP)");
            n++;
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print("* ");
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
