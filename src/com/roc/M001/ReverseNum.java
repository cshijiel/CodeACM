package com.roc.M001;

public class ReverseNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseNumber(152364125));
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
}
