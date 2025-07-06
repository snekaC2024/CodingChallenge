public class pattern26 {
    public static void main(String[] args) {
          int n = 5;
        pattern27(n);
    }

    static void pattern27(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {
            for (int col = 1; col <= 2 * n - 1; col++) {
                int minDist = Math.min(Math.min(row, col), Math.min(2 * n - row, 2 * n - col));
                System.out.print((n - minDist + 1) + " ");
            }
            System.out.println();
        }
    }
}
