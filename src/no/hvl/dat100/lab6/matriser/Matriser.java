package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] matrise1 = { { 1, 2, 3 },
							{ 4, 5, 6 }, 
							{ 7, 8, 9 } };

		skaler(4,matrise1);
	}

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] i : matrise) {

			for (int v : i) {
				System.out.print(v);

			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String txt = ""; 

		for(int i = 0; i < matrise.length; i++) {
			
			for(int j=0; j<matrise[i].length; j ++) {
				
				txt += Integer.toString(matrise[i][j]);
				txt += " ";
				
			}	txt += "\n";
		}System.out.println(txt);
		return txt;
		
		

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int a = tall; 
		for(int i = 0; i < matrise.length; i++) {
			
			for(int j=0; j<matrise[i].length; j ++) {
				
				int [][] nyMatrise = new int [matrise.length][matrise[i].length]; 
			
				
				nyMatrise [i][j] = matrise[i][j]*a;
				
				
				
				
				System.out.println(nyMatrise[i][j]);
			}
				
		}return matrise; 
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		Boolean erLike = false;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] != b[i][i]) {
					
					break;
				}else if(a[i][j] == b[i][i]) {
					erLike =true; 
				}

			}
		}
		System.out.println(erLike);
		return erLike; 

	
}
	

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
		
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
