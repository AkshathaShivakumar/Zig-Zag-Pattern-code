public class pattern2 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 13;

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= columns; c++) {
                if ((r == 1 && c % 4 == 3) || (r == 2 && c % 2 == 0) || (r == 3 && c % 4 == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
