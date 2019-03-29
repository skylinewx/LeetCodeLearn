/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (32.38%)
 * Total Accepted:    61K
 * Total Submissions: 188.3K
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * 
 * 示例 2:
 * 
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 
 * 
 * 说明:
 * 
 * 所有输入只包含小写字母 a-z 。
 * 
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if(length==0){
            return "";
        }
        String firstStr = strs[0];
        if(length==1){
            return firstStr;
        }
        int firstStrLength = firstStr.length();
        StringBuilder stringBuilder = new StringBuilder(firstStrLength);
        for(int index=0;index<firstStrLength;index++){
            char currentCar = firstStr.charAt(index);
            for(int i=1;i<length;i++){
                if(index>=strs[i].length()){//索引位置以及超长了
                    return stringBuilder.toString();
                }
                if(strs[i].charAt(index)!=currentCar){
                    return stringBuilder.toString();
                }
            }
            stringBuilder.append(currentCar);
        }
        return stringBuilder.toString();
    }
}

