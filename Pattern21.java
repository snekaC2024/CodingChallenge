public class Pattern21 {
    public static void main(String[] args) {
          int n = 5;
        pattern21(n);
    }
    static void pattern21(int n){
        for(int i = 1; i<=n;i++){
            for(int space = 1; space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1; star<=n-1;star++){
                if(i==1||i==n||star==1||star==n-1){
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
