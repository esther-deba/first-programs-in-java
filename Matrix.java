import java.util.Scanner;

public class Matrix {
	public Matrix() {
		int[][] matrice = {
			{0},
			{0}
		};
	}
	
	public Matrix(int n, int m) {
		this._m = m;
		this._n = n;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public int[][] remplirMatrix(int[][] tab){
		System.out.print("Enter the values wanted : ");

		for(int i=0; i<_n; i++) {
			for(int j=0; j<_m; j++) {
				tab[i][j] = sc.nextInt();
			}
		}
		return tab;
	}
	
	public void getMatrix(int[][] tab) {
		for(int i=0; i<_n; i++) {
			for(int j=0; j<_m; j++) {
				System.out.print(tab[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		
	}
	
	public int[][] addition(int[][] tab1, int[][] tab2, int[][] result){
		
		for(int i=0; i<_n; i++) {
			for(int j=0; j<_m; j++) {
				result[i][j] = tab1[i][j] + tab2[i][j];
			}
		}
		return result;
	}
	
	
	
	
	private int[][] _matrice;
	private int _n;
	private int _m;

}

