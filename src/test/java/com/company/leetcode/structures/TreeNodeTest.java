package com.company.leetcode.structures;

import org.junit.Test;
import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void testConstructor() {
        Integer[] values = {1, 2, 3, 4, null, 6, 7};
        TreeNode root = new TreeNode(values);

        assertEquals(1, root.val);
        assertEquals(2, root.left.val);
        assertEquals(3, root.right.val);
        assertEquals(4, root.left.left.val);
        assertNull(root.left.right);
        assertEquals(6, root.right.left.val);
        assertEquals(7, root.right.right.val);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyArray() {
        Integer[] values = {};
        TreeNode root = new TreeNode(values);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNullArray() {
        Integer[] values = null;
        TreeNode root = new TreeNode(values);
    }
}


