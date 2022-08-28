package com.project.binarysearch;

public class BinarySearch {
	private static int binarySearch(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		return helper(arr, target, low, high);

	}

	private static int helper(int[] arr, int target, int low, int high) {

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (arr[mid] == target) {
			return mid;
		} else if (target < arr[mid]) {
			return helper(arr, target, low, high - 1);
		} else {
			return helper(arr, target, low + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		System.out.println(binarySearch(arr, 000));
	}
}
