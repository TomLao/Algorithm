/*
 * @lc app=leetcode id=1 lang=cpp
 *
 * [1] Two Sum
 * 
 * 使用哈希表，空间换时间。
 * 第一次循环，建立索引。
 * 第二次，边比较当前值是否有对应于map中之前留下的值，有则返回，否则加入map。
 * 
 * 时间复杂度：O(n)
 * 空间复杂度：O(n)
 */
#include <unordered_map>
#include <vector>
using namespace std;
class Solution {
public:
    //查找表的方法，
    vector<int> twoSum(vector<int>& nums, int target) {
        //构建哈希表
        unordered_map<int, int> record;
        vector<int> res;
        for(size_t i = 0; i < nums.size(); ++i) {
            int num = nums[i];  //记录当前数字
            if(record.count(target - num)) {    //统计键值为(目标数-当前数)的个数，if不为0
                res.push_back(i);   //找到一对
                res.push_back(record[target - num]);
                break;
            }else{
                record.insert(pair<int, int>{nums[i], i});  // 记录当前值和对应下标
                // record[nums[i]] = i;  
            }
              
        }
        return res;
    }
};

