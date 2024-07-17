class Solution {
    public int searchInsert(int[] nums, int target) {
       return searchInsert(nums, target, 0, nums.length - 1);
    }
   public int searchInsert(int[] nums, int target, int start, int end) {
       int mid = start +(end-start)/2;
       if(start>end){
           return start;
       }
       if(nums[mid] == target){
           return mid;
       } 
       else if(nums[mid] > target){
           return searchInsert(nums, target, start, mid - 1);
       } 
       else {
           return searchInsert(nums, target, mid + 1, end);
       }
   }
   
   
}