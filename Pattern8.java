public class Pattern8 {

	public static void main(String[] args) {
		
		int n=5;
		pattern8(n);
	}

	static void pattern8(int n) {
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print( i+" ");
			}
			
	        System.out.println();
	        
		}
	}

}

