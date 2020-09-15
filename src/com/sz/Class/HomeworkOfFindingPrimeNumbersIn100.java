package com.sz.Class;

import java.util.Scanner;

public class HomeworkOfFindingPrimeNumbersIn100 {

	public static boolean isPrime(int num) {
		boolean isPrimeNumber = true;
		if (num == 1) {
			isPrimeNumber = false;
		}


		for (int i=2; i<(int)Math.sqrt(num)+1; i++) {
			if (num % i == 0) {
				isPrimeNumber = false;
			}
		}

		return isPrimeNumber;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeCounter = 0;
		int number = 1;
		int [] prime = new int[100];
		
		while (true) {
			boolean yesOrNo = isPrime(number);
			if (primeCounter == 100) {
				break;
			}else {
				if (yesOrNo) {
					prime[primeCounter] = number;
					primeCounter++;
				}
			}
			number++;
		}
		for(int i=0; i<prime.length; i++) {
			System.out.println(prime[i]);
		}


	}

}
