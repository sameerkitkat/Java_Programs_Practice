package com.project.binarysearch;

import java.util.ArrayList;

public class FirstandLastPosition {
	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		ArrayList<Integer> list = new ArrayList<>();
		list = search(nums, 8);
		System.out.println(list);
	}

	private static ArrayList<Integer> search(int[] nums, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		int lowerBound = findBound(nums, target, true);
		if (lowerBound == -1) {
			list.add(-1);
			list.add(-1);
			return list;
		}
		int upperBound = findBound(nums, target, false);
		list.add(lowerBound);
		list.add(upperBound);
		return list;

	}

	private static int findBound(int[] nums, int target, boolean isLower) {
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] == target) {
				if (isLower) {
					if (mid == start || nums[mid - 1] != target) {
						return mid;
					}
					end = mid - 1;
				} else {
					if (mid == end || nums[mid + 1] != target) {
						return mid;
					}
					start = mid + 1;
				}
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
