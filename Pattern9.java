package pattern_Problems;

public class Pattern9 {
	
	public static void main(String[] args) {
		int n = 10;
		int n1 = n/2;
		System.out.println(n1);
		int k=n1+1;
//		System.out.println(k);
		//first half
		for(int i=0;i<=n1;i++) {
			//spaces
			for(int j=0;j<i;j++) {
				System.out.print("_");
			}
			//stars
			for(int j=0;j<k;j++) {
				System.out.print("* ");
			}
			k--;
			System.out.println();
		}
		//second half
		for(int i=0;i<n1;i++) {
			//spaces
			for(int j=0;j<n1-i;j++) {
				System.out.print("_");
			}
			//stars
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//* * * * * * 
//_* * * * * 
//__* * * * 
//___* * * 
//____* * 
//_____* 
//_____* 
//____* * 
//___* * * 
//__* * * * 
//_* * * * * 
