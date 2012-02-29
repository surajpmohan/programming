package org.bn.programming;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * This program will generate the first n fibonacci numbers.
 * @author suraj mohanan
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scanner.nextInt();
		generateFirstNFibonacciNumbers(n);
	}
	/**
	 * Method to generate the first n fibonacci numbers.
	 * @param n
	 */
	public static void generateFirstNFibonacciNumbers(int n){
		BigDecimal num1 = new BigDecimal(0);
		BigDecimal num2 = new BigDecimal(1);
		BigDecimal num3;
		for(int i=1; i<=n; i++){
			System.out.println(i + " - " + num1);
			num3 = num1.add(num2);
			num1 = num2;
			num2 = num3;
		}
	}

}
