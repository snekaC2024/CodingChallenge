public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        pattern12(n);
    }
    static void pattern12(int n){
        for(int i = 1; i<=n; i++){
            for(int space=1; space<=i-1;space++){
                System.out.print("  ");
            }
            for(int star = 1; star<=n-(i-1);star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
