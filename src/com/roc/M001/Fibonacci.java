package com.roc.M001;

/**
 * 几种写法,
 * 
 * 青蛙跳台阶问题,矩形覆盖问题可用Fibonacci数列求解,
 * 
 * 青蛙跳台阶问题-如果可跳1，2，3，……，n，则可用数学归纳法证明f(n) = 2^(n-1)
 * 
 * @author Roc
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci1(10));
		System.out.println(fibonacci2(0));
		System.out.println(256 >> 8);
	}

	/**
	 * 最通用的办法，采用递归，效率堪忧
	 * 
	 * @param n
	 * @return
	 */
	private static long fibonacci1(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci1(n - 1) + fibonacci1(n - 2);
	}

	/**
	 * 循环实现的办法
	 * 
	 * @param n
	 * @return
	 */
	private static long fibonacci2(int n) {
		int[] result = { 0, 1 };
		if (n < 2) {
			return result[n];
		}
		long fibNMinusOne = 1;
		long fibNMinusTwo = 0;
		long fibN = 0;
		for (int i = 2; i <= n; i++) {
			fibN = fibNMinusOne + fibNMinusTwo;
			fibNMinusTwo = fibNMinusOne;
			fibNMinusOne = fibN;
		}
		return n;
	}
}
