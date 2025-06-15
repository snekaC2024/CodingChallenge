public class Pattern5 {
    public static void main(String[] args) {
		
		int n = 4;
		pattern5(n);
	}

	static void pattern5(int n) {
	
		for(int i = 1; i < 2*n; i++) {
			int colNo = i>n ? 2*n-i : i;
			
			for(int j = 1; j <= colNo; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
