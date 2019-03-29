import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 *
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (36.97%)
 * Total Accepted:    55.7K
 * Total Submissions: 150.8K
 * Testcase Example:  '"()"'
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 
 * 
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 
 * 
 * 注意空字符串可被认为是有效字符串。
 * 
 * 示例 1:
 * 
 * 输入: "()"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: "()[]{}"
 * 输出: true
 * 
 * 
 * 示例 3:
 * 
 * 输入: "(]"
 * 输出: false
 * 
 * 
 * 示例 4:
 * 
 * 输入: "([)]"
 * 输出: false
 * 
 * 
 * 示例 5:
 * 
 * 输入: "{[]}"
 * 输出: true
 * 
 */
class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        int length = s.length();
        Character c1 = '(';
        Character c2 = '[';
        Character c3 = '{';
        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                list.add(c);
            }else if (c==')'){
                if(list.size()==0){
                    return false;
                }
                boolean success = list.remove(c1);
                if(!success){
                    return false;
                }
            }else if(c==']'){
                if(list.size()==0){
                    return false;
                }
                boolean success = list.remove(c2);
                if(!success){
                    return false;
                }
            }else if(c=='}'){
                if(list.size()==0){
                    return false;
                }
                boolean success = list.remove(c3);
                if(!success){
                    return false;
                }
            }
        }
        return list.size()==0;
    }
}

