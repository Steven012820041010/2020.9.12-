package com.sz.Class;

import java.util.Scanner;

public class HomeworkOfMatrixMultiplicationWithUsingMethod {
	//Matrix A
	
	public static int inputOfMatrixARowAndColumn (Scanner sc) {
		int num = 0;
		while(true) {
			try {
				System.out.println("Please input the number of row/column of your Matrix A");
				String input = sc.nextLine();
				num = Integer.parseInt(input);
				break;

			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Sorry, INVALID INPUT");
			}
		}

		return num;

	}

	public static int[][] inputOfMatrixA (Scanner sc){
		int rowA = inputOfMatrixARowAndColumn(sc);
		int columnA = inputOfMatrixARowAndColumn(sc);

		int [][] matrixA = new int [rowA][columnA];

		for (int i=0; i<rowA; i++) {
			System.out.format("Please input a row with %d numbers\n",columnA);
			String rowInput = sc.nextLine();
			Scanner rowScanner = new Scanner(rowInput).useDelimiter("\\s+");

			for (int j=0; j<columnA; j++) {
				matrixA[i][j] = rowScanner.nextInt();
			}
		}
		return matrixA;
	}


	//Matrix B
	public static int inputOfMatrixBRowBndColumnB (Scanner sc) {
		int num = 0;
		while(true) {
			try {
				System.out.println("Please input the number of row/column of your Matrix B");
				String input = sc.nextLine();
				num = Integer.parseInt(input);
				break;

			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Sorry, INVALID INPUT");
			}
		}

		return num;

	}

	public static int [][] inputOfMatrixB (Scanner sc){
		int rowB = inputOfMatrixBRowBndColumnB(sc);
		int columnB = inputOfMatrixBRowBndColumnB(sc);
		int [][] matrixB = new int [rowB][columnB];

		for(int i=0; i<rowB; i++) {
			System.out.format("Please input a row with %d numbers\n",columnB);
			String rowInput = sc.nextLine();
			Scanner rowScanner = new Scanner(rowInput).useDelimiter("\\s+");
			for(int j=0; j<columnB; j++) {
				matrixB[i][j] = rowScanner.nextInt();
			}
		}

		return matrixB;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [][] matrixA = inputOfMatrixA(sc);	
		int rowA = matrixA.length;
		int columnA = matrixA[0].length; 
		
		
		int [][] matrixB = inputOfMatrixB(sc);
		int rowB = matrixB.length;
		int columnB = matrixB[0].length; 
		
		if (columnA != rowB) {
			System.out.println("Sorry, your columnA should be equal to rowB");
			
			return;
		}
		
		int [][] matrixC = new int[rowA][columnB];
		
		for (int i=0; i<rowA; i++) {
			for (int j=0; j<columnB; j++) {
				int sum = 0;
				for (int k=0; k<rowB; k++) {
					sum += matrixA[i][k] * matrixB[k][j];
				}
			matrixC[i][j] = sum;
			}
		}
		for (int i=0; i<rowA; i++) {
			for (int j=0; j<columnB; j++) {
				System.out.format("%2d", matrixC[i][j]);
				if(j!=matrixC[i].length-1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}

	}

}
