public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        pattern20(n);
    }
    static void pattern20(int n){
        for(int i = 1; i<=2*n-1;i++){
            int rowChange = i>n ? (n*2)-i : i;
            for(int space = 1; space<=n-rowChange;space++){
                System.out.print(" ");
            }
            for(int star=1; star<=2*rowChange-1;star++){
                System.out.print("*"); 
            }
            System.out.println();
        }   
    }
}

