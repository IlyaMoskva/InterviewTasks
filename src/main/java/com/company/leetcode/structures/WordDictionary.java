package com.company.leetcode.structures;

import java.util.HashMap;
import java.util.Map;

/**
 * 211. Design Add and Search Words Data Structure
 * Design a data structure that supports adding new words and finding if a string matches any previously added string.
 * Implement the WordDictionary class:
 * WordDictionary() Initializes the object.
 * void addWord(word) Adds word to the data structure, it can be matched later.
 * bool search(word) Returns true if there is any string in the data structure that matches word or false otherwise.
 *   word may contain dots '.' where dots can be matched with any letter.
 * EXAMPLE:
 * Input
 * ["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
 * [[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
 * Output
 * [null,null,null,null,false,true,true,true]
 * Explanation
 * WordDictionary wordDictionary = new WordDictionary();
 * wordDictionary.addWord("bad");
 * wordDictionary.addWord("dad");
 * wordDictionary.addWord("mad");
 * wordDictionary.search("pad"); // return False
 * wordDictionary.search("bad"); // return True
 * wordDictionary.search(".ad"); // return True
 * wordDictionary.search("b.."); // return True
 */
public class WordDictionary {

    class TrieNode {
        Map<Character, TrieNode> children;
        boolean isWord;

        public TrieNode() {
            children = new HashMap<>();
            isWord = false;
        }
    }

    public WordDictionary() {
        TrieNode root = new TrieNode();
    }

    public void addWord(String word) {

    }

    public boolean search(String word) {
        return false;
    }
}
