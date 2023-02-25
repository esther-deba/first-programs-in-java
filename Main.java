import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n,m;
		System.out.print("Enter the number of lines : ");
		n = sc.nextInt();
		System.out.print("Enter the number of columns : ");
		m = sc.nextInt();
		
		Matrix mat = new Matrix(n,m);

		int[][] tab1 = new int[n][m];
		int[][] tab2 = new int[n][m];
		int[][] resultat = new int[n][m];
		
		
		System.out.println("Nous allons effectuer une addition de deux matrices entrez les valeurs voulues : ");
		tab1 = mat.remplirMatrix(tab1);
		tab2 = mat.remplirMatrix(tab2);
		resultat = mat.addition(tab1, tab2, resultat);
		System.out.println('\n');
		mat.getMatrix(tab1);
		System.out.println("ADDITION AVEC : ");
		mat.getMatrix(tab2);
		System.out.println("EGAL : ");
		mat.getMatrix(resultat);
		
		sc.close();
	}
}
