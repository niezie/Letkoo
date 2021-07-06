import java.util.HashMap;

public class lk0001_2 {
    public int[] twoSum(int[] nums, int target){
        int[] index=new int[2];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.get(target-nums[i])!=null){
                index[0]=i;
                index[1]=map.get(target-nums[i]);
                if (index[0]!=index[1]){
                    break;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        lk0001_1 lk=new lk0001_1();
        int a[]=lk.twoSum(new int[]{1,2,3,4,5},6);
        System.out.println("["+a[0]+","+a[1]+"]");
    }
}
