class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        numMap={}
        n=len(nums)

        for i in range(n):
            numMap[nums[i]]=i
        
        for i in range(n):
            diff=target-nums[i]

            if diff in numMap and numMap[diff]!=i:
                return [i,numMap[diff]]
        
        return []