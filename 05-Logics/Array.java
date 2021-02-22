package Dita.Logic;
/*
 * How arrays work
 */
public class Array {

	public static void main (String []args) {
	int [][]A = {{3,4},{5,6}};
	int [][]B = {{1,0},{-2,3}};
	
//dispay A
	for (int i=0; i<A.length; i++) {
		for (int j=0; j<A.length; j++) {
			System.out.print(A[i][j]+ " ");
		}
		System.out.println();
	}
	
	System.out.println();
	
//display B	
	for (int i=0; i<B.length; i++) {
		for (int j=0; j<B.length; j++) {
			System.out.print(B[i][j]+ " ");
		}
		System.out.println();
	}

	System.out.println();
	
	
//display A+B
	int [][]C = new int [2][2];
	for (int i=0; i<C.length; i++) {
		for (int j=0; j<C.length; j++) {
			C[i][j] = A[i][j]+B[i][j];
			System.out.print(C[i][j]+ " ");
		}
		System.out.println();
	}

	System.out.println();
	
//display A-B	
	int [][]D = new int [2][2];
	for (int i=0; i<D.length; i++) {
		for (int j=0; j<D.length; j++) {
			D[i][j] = A[i][j]-B[i][j];
			System.out.print(D[i][j]+ " ");
		}
		System.out.println();
	}

	System.out.println();
	
//display A*B
	int [][]E = new int [2][2];
//FIRST ROW	
	int i=0;
	//for (int i=0; i<E.length; i++) {
		for (int j=0; j<E.length; j++) {
			E[i][j]=(A[i][i]*B[i][j])+(A[i][1]*B[1][j]);
			System.out.print(E[i][j]+ " ");
		}
		System.out.println();
	//}
//SECOND ROW		
	i=1;
	//for (int i=1; i<E.length; i++) {
		for (int j=0; j<E.length; j++) {
			E[i][j]=(A[i][0]*B[0][j])+(A[i][i]*B[i][j]);
			System.out.print(E[i][j]+ " ");
		}
		System.out.println();
	//}

//	E[0][0]=(A[0][0]*B[0][0])+(A[0][1]*B[1][0]);
//	E[0][1]=(A[0][0]*B[0][1])+(A[0][1]*B[1][1]);
//	E[1][0]=(A[1][0]*B[0][0])+(A[1][1]*B[1][0]);
//	E[1][1]=(A[1][0]*B[0][1])+(A[1][1]*B[1][1]);
	
	}
}
