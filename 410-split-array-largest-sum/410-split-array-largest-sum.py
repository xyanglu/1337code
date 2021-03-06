class Solution:
    def splitArray(self, nums: List[int], m: int) -> int:
        def canSplit(largest):
            subarray = 0
            curSum = 0
            for n in nums:
                curSum += n
                if curSum > largest:
                    subarray += 1
                    curSum = n
            return subarray + 1 <= m
        
        l, r = max(nums), sum(nums)
        while l < r:
            mid = (l+r)// 2
            if canSplit(mid):
                r = mid
            else:
                l = mid + 1
        return r