package com.hms.algorithm.daily.utils;

import java.util.List;

/**
 * @ClassName Node
 * @Author hms
 * @Date 2024/2/20 21:39
 * @Description TODO
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

