public class Pattern15 {
     public static void main(String[] args) {
         int n = 3;
        pattern15(n);
    }
     static void pattern15(int n){
        for(int i = 1; i<=n*2-1; i++){
            int rowChange= i>n ? (n*2)-i : i;
            for(int space=1; space<=n-rowChange;space++){
                System.out.print("  ");
            }
            for(int star = 1; star<=(rowChange*2)-1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
