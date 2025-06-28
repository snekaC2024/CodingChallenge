public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        pattern17(n);
    }
    static void pattern17(int n){
        for(int i = 4; i>=1; i--){
            for(int space =1 ; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int col = 1; col<=2*i-1;col++){
                if(col==1||col==2*i-1||i==n){
                   
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}
