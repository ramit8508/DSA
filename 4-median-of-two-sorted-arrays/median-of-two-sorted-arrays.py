class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        tot = nums1 + nums2
        tot.sort()

        n = len(tot)
        mid = int(n/2)
        print(mid)
        if n%2 == 0:
            return (tot[mid]+tot[(mid)-1])/2
        else:
            return tot[mid]

