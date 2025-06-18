public class Pattern6 {

	public static void main(String[] args) {
		
		int n=5;
		pattern6(n);
	}

	static void pattern6(int n) {
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n-(i-1); j++) {
				System.out.print( n-(i-1)+" ");
			}
			
	        System.out.println();
	        
		}
	}
}