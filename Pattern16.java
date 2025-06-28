public class Pattern16 {
    public static void main(String[] args) {
        int n = 4;
        pattern16(n);
    }
    static void pattern16(int n){
        for(int i = 1; i<=n; i++){
            for(int space = 1; space<=n-i; space++){
                System.out.print(" ");
            }
            for(int star = 1; star<=(i*2)-1;star++){
                if(star==1 || star==(i*2)-1 ||i==n){
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
