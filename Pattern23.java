public class Pattern23 {
    public static void main(String[] args) {
          int n = 5;
        pattern23(n);
    }

    static void pattern23(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int rowChange = row > n ? 2 * n - row : row;
            for (int col = 1; col <= 2 * n; col++) {
                if (col <= rowChange || col > (2 * n) - rowChange) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
