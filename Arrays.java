public class Arrays {
    public static void main(String[] args) {
        int list1D[] = new int[5];
        for (int i = 0; i < list1D.length; i++) {
            list1D[i] = i + 1;
        }
        for (int i : list1D) {
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("----------");

        int list2D[][] = new int[3][3];
        for (int i = 0; i < list2D.length; i++) {
            for (int j = 0; j < list2D[i].length; j++) {
                list2D[i][j] = i + 1;
            }
        }
        for (int i[] : list2D) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
