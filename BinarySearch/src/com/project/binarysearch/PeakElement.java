package com.project.binarysearch;

public class PeakElement {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int index = peakElement(nums);
		System.out.println(index);
	}

	private static int peakElement(int[] nums) {
		int start = 0;
		int end = nums.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;
			if (nums[mid] > nums[mid+1]) {
				end = mid;
			}
			else {
				start = mid+1;
			}
			
		}

		return start;
	}
}
