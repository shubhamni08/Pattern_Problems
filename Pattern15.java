package pattern_Problems;

public class Pattern15 {

	public static void main(String[] args) {
		int n = 5;
		for(int i=0;i<n;i++) {
			int k=1;
			for(int j=0;j<i+1;j++) {	
				System.out.print(k+++" ");
			}
			System.out.println();
		}
	}
}

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
