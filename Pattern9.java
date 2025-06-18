public class Pattern9 {
		public static void main(String[] args) {
		
			int n=5;
			pattern9(n);
		}
		static void pattern9(int n) {
			boolean printValue;
			for(int i =1; i<=n; i++) {
				printValue = i%2==0 ? true:false;
				
				for(int j=1; j<=i; j++) {
					System.out.print( printValue ? 0:1);
					System.out.print(" ");
					printValue = !printValue;
				}
				
		        System.out.println(); 
			}
		}
	}