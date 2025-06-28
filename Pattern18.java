public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        pattern18(n);
    }
    static void pattern18(int n){
        for(int i = 1; i<=(n*2)-1;i++){
            int rowChange = i>n ? (n*2)-i : i;
            for(int space = 1; space<=rowChange-1;space++){
                System.out.print(" ");
            }
            for(int star=1; star<=n-rowChange+1;star++){
                System.out.print("* ");
            }
            System.out.println();
        }   
    }
}
