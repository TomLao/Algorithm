#
# @lc app=leetcode id=3 lang=python3
#
# [3] Longest Substring Without Repeating Characters
#
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = maxLength = 0
        mymap = {}

        for i in range(len(s)):
            if s[i] in mymap and start <= mymap[s[i]]:
                start = mymap[s[i]] + 1 #有重复的，更新起点
            else:
                maxLength = max(maxLength, i - start + 1)   #取较大一个尾部
            
            mymap[s[i]] = i #插入新键值

        return maxLength

