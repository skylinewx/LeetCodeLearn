import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.html.HTML.Tag;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 *
 * https://leetcode-cn.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (45.36%)
 * Total Accepted:    289.5K
 * Total Submissions: 638.3K
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 
 * 给定 nums = [2, 7, 4, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * 
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int length = nums.length;
        for (int i=0;i<length;i++) {
            Integer leftVal = nums[i];
            Integer rigthVal = target-leftVal;
            if(map.containsKey(rigthVal)){
                return new int[]{i,map.get(rigthVal)};
            }
            map.put(leftVal,i);
        }
        return null;
    }
}

