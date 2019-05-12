#
# @lc app=leetcode id=1 lang=python3
#
# [1] Two Sum
#
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # 字典类型，key:value型，类似map
        dict = {}
        for i in range(len(nums)):
            if nums[i] in dict:             #查找值是否在dict的key中，
                return [dict[nums[i]], i]   #找到了对应与target-nums[i]后的值，返回这个值的位置和i
            else:
                dict[target - nums[i]] = i  #添加到字典，dict[key]=value

