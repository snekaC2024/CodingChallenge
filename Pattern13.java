public class Pattern13 {
    public static void main(String[] args) {
         int n = 5;
        pattern13(n);
    }
     static void pattern13(int n){
        for(int i = 1; i<=n; i++){
            for(int space=1; space<=n-i;space++){
                System.out.print("  ");
            }
            for(int star = 1; star<=(i*2)-1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
