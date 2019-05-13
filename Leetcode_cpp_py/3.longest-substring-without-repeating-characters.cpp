/*
 * @lc app=leetcode id=3 lang=cpp
 *
 * [3] Longest Substring Without Repeating Characters
 * 
 * 滑窗法，维护一个map，key为字符，value为key在串中的位置
 * 1. 记录子串开始的位置start，
 * 2. 遇到重复的字符则后移一位start+1
 * 3. 不重复且子串最大长度增加，则更新maxLength
 */
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<int, int> mymap;
        int start, maxLength;
        start = maxLength = 0;

        for(int i = 0; i < s.length(); i++){
            if(mymap.count(s[i]) && start <= mymap[s[i]]){
                start = mymap[s[i]] + 1;
            }else{
                maxLength = max(maxLength, i - start + 1);
            }
            mymap[s[i]] = i;
        }
        return maxLength;
    }
};

