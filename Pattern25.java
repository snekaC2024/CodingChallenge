public class Pattern25 {
    public static void main(String[] args) {
          int n = 5;
        pattern25(n);
    }

    static void pattern25(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            for (int space = 1; space <= (n * 2) - (2 * row); space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
