package com.project.binarysearch;

public class SquareRoot {

	private static int squareRoot(int n) {

		int low = 1;
		int high = n / 2;

		while (low < high) {
			int mid = (low + high) / 2;
			int temp = n / mid;
			if (mid == temp) {
				return mid;
			} else if (mid > temp) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return high;

	}

	public static void main(String[] args) {
		int n = 144;
		System.out.println(squareRoot(n));
	}

}
