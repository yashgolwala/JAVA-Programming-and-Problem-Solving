class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=1; //first positive number
        Arrays.sort(nums); //sorting array
        while(Arrays.binarySearch(nums,i)>=0) i++; //if present, binary search returns index number and so i is incremented.
        return i;
    }
}
