package src.demo0706;

public class lk0001 {
        public int[] twoSum(int[] nums, int target) {
            int[] indexs = new int[2];
            for(int i=0;i<nums.length;i++){
                for(int j=1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        indexs[0]=i;
                        indexs[1]=j;
                        continue;
                    }
                }
            }
            return indexs;
        }

    public static void main(String[] args) {
        lk0001 lk=new lk0001();
        int a[]=lk.twoSum(new int[]{1,5},6);
        System.out.println("["+a[0]+","+a[1]+"]");
    }
}
