class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        minn = 1e9
        diff = -1
        for i in nums:
            if i <= minn:
                minn = i
            else:
                diff = max(diff,i-minn)
        return diff