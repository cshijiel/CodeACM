package com.roc.M001;

/**
 * @author Chen
 *
 */
public class ReverseNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long b = 1234567891;
		System.out.println(reverseNumber(b)+"\n"+reverse((int) b));
	}

	public static long reverseNumber(long inputN) {
		int leftN = 0;// inputN%10
		long midN = inputN;// inputN/10
		long sum = 0;
		while (midN != 0) {
			leftN = (int) (midN % 10);
			midN = midN / 10;
			sum = sum * 10 + leftN;
		}
		return sum;

	}

	/**
	 * 网上的代码，很简练
	 * @param a
	 */
	public static int reverse(int a) {
		int rs = 0;
		while (a > 0) {
			rs *= 10;
			rs += a % 10;
			a /= 10;
		}
		return rs;
	}
}
