package pattern_Problems;

public class Pattern14 {
	static char ch = 'A';
	public static void main(String[] args) {
		int n=4;
		
		for(int i=0;i<n;i++) {
			int k=3;
			
			//spaces
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			//characters
			for(int j=0;j<1;j++) {
				System.out.print(ch);
			}
			//spaces
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			//spaces
			for(int j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			
			//character
			for(int j=0;j<1;j++) {
				if(i==0) continue;
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}

	}

}
