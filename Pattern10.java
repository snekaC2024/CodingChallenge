public class Pattern10 {
	public static void main(String[] args) {
		int n=5;
		pattern10(n);
	}

	static void pattern10(int n) {
		int printValue = 1;
		for(int i =1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.printf("%-3d", printValue);
				printValue++;
			}
	        System.out.println();   
		}
	}
}