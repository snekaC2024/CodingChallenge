public class Pattern2 {
    public static void main(String[] args) {
		
		int n = 5;
		pattern1(n);
	}
	
	static void pattern1(int n) {

		for(int i =1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
