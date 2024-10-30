package pattern_Problems;

public class Pattern10 {

	public static void main(String[] args) {wqw
		int n = 7;
		int n1 = n/2;
		//first half
		for(int i=0;i<=n1;i++) {
			//spaces
			for(int j=0;j<n1-i;j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		//second half
		for(int i=0;i<=n1;i++) {
			//spaces
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=0;j<n1-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//   * 
//  * * 
// * * * 
//* * * * 
// * * * 
//  * * 
//   * 
