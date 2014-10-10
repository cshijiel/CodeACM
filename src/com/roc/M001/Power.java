package com.roc.M001;
/**
 * 这个题来自剑指Offer--
 * @author Roc
 *
 */
public class Power {

	static boolean g_InvalidInput = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		System.out.println(MathPower(3,169)+"\n");
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		long start1 = System.currentTimeMillis();
		System.out.println(calc_1(3,169)+"\n");
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
	}

	private static double MathPower(double base, int exponent) {
		g_InvalidInput = false;
		if (exponent < 0 && equal(base, 0.0)) {
			g_InvalidInput = true;
			return 0.0;
		}

		int absExponent = exponent;
		if (exponent < 0) {
			absExponent = -exponent;
		}
		double result = PowerWidthUnsighedExponent(base, absExponent);
		if (exponent < 0) {
			result = -result;
		}
		return result;
	}

	private static boolean equal(double num1, double num2) {
		// TODO Auto-generated method stub
		if ((num1 - num2 > -0.0000001) && (num1 - num2 < 0.0000001)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 优化后的算法
	 * @param base
	 * @param absExponent
	 * @return
	 */
	private static double PowerWidthUnsighedExponent(double base,
			int absExponent) {
		// TODO Auto-generated method stub
		if (absExponent == 0) {
			return 1;
		}
		if (absExponent == 1) {
			return base;
		}
		double result = PowerWidthUnsighedExponent(base, absExponent >> 1);
		result *= result;
	//	System.out.println("--->"+(absExponent & 0x1)+absExponent+0x1);
		if ((absExponent & 0x1) == 1) {
			result *= base;
		}
		return result;
	}
	
	/**
	 * 优化之前的算法
	 * @param base
	 * @param absExponent
	 * @return
	 */
	private static double PowerWidthUnsighedExponent_Old(double base,
			int absExponent) {
		// TODO Auto-generated method stub
		double result = base;
		for (int i = 1; i < absExponent; i++) {
			result *= base;
		}
		return result;
	}
	public static double calc_1(long a, long b) {
		final String s = Long.toBinaryString(b);
		int length = s.length();
		double result = 1;
		for (int i = 0; i < length; ++i) {
			char temp = s.charAt(i);
			result = (result * result) ;
			if (temp == '1') {
				result = (result * a) ;
			}
		}
		return result;
	}

}
