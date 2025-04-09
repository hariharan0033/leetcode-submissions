class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        # If there is any number less than k, it's impossible to convert all numbers to k
        if any(num < k for num in nums):
            return -1

        # Sort nums to handle the distinct numbers greater than k
        nums = sorted(nums)

        # Count distinct numbers strictly greater than k
        nums_greater_than_k = [num for num in nums if num > k]
        distinct_operations = len(set(nums_greater_than_k))
        
        # Return how many distinct numbers greater than k must be reduced
        return distinct_operations
