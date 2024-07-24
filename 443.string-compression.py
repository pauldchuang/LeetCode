#
# @lc app=leetcode id=443 lang=python3
#
# [443] String Compression
#

# @lc code=start
class Solution:
    def compress(self, chars: List[str]) -> int:
        index = 0 
        indexAns = 0
        
        while index < len(chars):
            currentChar = chars[index]
            count = 0
            while index < len(chars) and chars[index] == currentChar:
                index += 1
                count += 1
            chars[indexAns] = currentChar
            indexAns += 1
            if count != 1:
                for c in str(count):
                    chars[indexAns] = c
                    indexAns += 1
                    
        return indexAns                            
        
# @lc code=end

