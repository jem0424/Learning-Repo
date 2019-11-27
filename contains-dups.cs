//solution for https://leetcode.com/problems/contains-duplicate/submissions/https://leetcode.com/problems/contains-duplicate/submissions/
public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        var myList = new Dictionary<int,int>() ;
        for (int i=0; i<nums.Length;i++) {
            if (myList.ContainsKey(nums[i])) {
                return true;
            }
            else {
                myList.Add(nums[i],1);
            }
        }
        return false;
    }

}