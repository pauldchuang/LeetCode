#
# @lc app=leetcode id=1268 lang=python3
#
# [1268] Search Suggestions System
#

# @lc code=start
from collections import defaultdict
class Solution:
    def suggestedProducts(self, products: List[str], searchWord: str) -> List[List[str]]:
        class TrieNode:
            def __init__(self):
                self.children = defaultdict(TrieNode)
                self.suggestions = []
            def addSuggestions(self, product):
                if len(self.suggestions) < 3:
                    self.suggestions.append(product)

        products.sort()
        root = TrieNode()
        for p in products:
            node = root
            for c in p:
                node = node.children[c]
                node.addSuggestions(p)

        result = []
        
        node = root
        for c in searchWord:
            node = node.children[c]
            result.append(node.suggestions)

        return result


# @lc code=end
