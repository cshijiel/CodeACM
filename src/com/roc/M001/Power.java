package com.roc.M001;
/**
 * 这个题来自剑指Offer
 * @author Roc
 *
 */
public class Power {

	static boolean g_InvalidInput = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MathPower(3.54, 4));
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

	private static double PowerWidthUnsighedExponent(double base,
			int absExponent) {
		// TODO Auto-generated method stub
		double result = base;
		for (int i = 1; i <= absExponent; i++) {
			result *= base;
		}
		return result;
	}
}
