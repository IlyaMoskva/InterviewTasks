package com.company.leetcode.structures;

import java.util.LinkedList;
import java.util.Queue;

/**
 LC 606. Construct String from Binary Tree
 Given the root of a binary tree, construct a string consisting of parenthesis and integers
 from a binary tree with the preorder traversal way, and return it.

 Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship
 between the string and the original binary tree.

 Example 1:
 Input: root = [1,2,3,4]
 Output: "1(2(4))(3)"
 Explanation: Originally, it needs to be "1(2(4)())(3()())",
 but you need to omit all the unnecessary empty parenthesis pairs. And it will be "1(2(4))(3)"

 Example 2:
 Input: root = [1,2,3,null,4]
 Output: "1(2()(4))(3)"
 Explanation: Almost the same as the first example,
 except we cannot omit the first parenthesis pair to break the one-to-one mapping
 relationship between the input and the output.
 */
public class BiTreePreorderTraverse {
    public String tree2str(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root, sb);
        return sb.toString();
    }
    public StringBuilder traverse(TreeNode root, StringBuilder sb) {
        if (root == null) return sb;
        sb.append(root.val);
        if (root.left != null || root.right != null) {
            sb.append('(');
            traverse(root.left, sb);
            sb.append(')');
        }
        if (root.right != null) {
            sb.append('(');
            traverse(root.right, sb);
            sb.append(')');
        }
        return sb;
    }
}
