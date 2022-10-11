// 349. Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hast = new HashSet <Integer>();
        for (int i : nums1) {
			for (int j : nums2) {
				if (i == j) {
					hast.add(i);
				}
			}
		}
        int[] arr = new int[hast.size()];
		int k = 0;
		for (int elem : hast){
			arr[k++] = elem;
		}
		return arr; 
    }
}