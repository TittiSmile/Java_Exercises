/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

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
