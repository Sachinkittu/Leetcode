import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
       int size = nums.length;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i]=-1;
                size--;
            }
        }
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=nums.length-1;i>=0;i--)
            arr[j++]=nums[i];
        for(int i=0;i<nums.length;i++)
            nums[i]=arr[i];
        
        return size;
        
    }
}
