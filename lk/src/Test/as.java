package Test;
class Solution {
//    public int search(int[] nums, int target) {
//        int nub=-1;
//        int avg=(nums.length/2);
//        if(target==nums[avg]){
//            nub=avg;
//        }
//        else if(target<nums[avg]){
//            int i=avg;
//            for(;i>-1;i--){
//                if(target==nums[i]){
//                    nub=i;
//                    break;
//                }
//            }
//        }
//        else if(target>nums[avg]){
//            for(int i=avg;i<nums.length;i++){
//                if(target==nums[i]){
//                    nub=i;
//                    break;
//                }
//            }
//        }
//        return nub;
//    }
    public int search(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        int pivot;
        while (left<=right){
            pivot=left+(right-left)/2;
        if(nums[pivot]==target) return pivot;
        else if(nums[pivot]>target) right=pivot-1;
        else if(nums[pivot]<target) left=pivot+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.search(new int[]{1,2,3,4,5,6,7,8,9},5));
    }
}