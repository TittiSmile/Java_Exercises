import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Solution s = new Solution();
		//int nums[]={2,7,11,15};
		int nums[]={3,2,4};
		int target=6;
		int sol[]=new int[2];
        sol=s.twoSum(nums,target);
        for(int i=0;i<sol.length;i++){
            System.out.println(sol[i]);
        }
	}
}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arrSol[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arrSol[0]=i;
                    arrSol[1]=j;
                }
                //System.out.println(nums[i]+"     "+nums[j]);
            }    
        }
        return arrSol;
    }
}
