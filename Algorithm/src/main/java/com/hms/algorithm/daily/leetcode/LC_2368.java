package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName LC_2368
 * @Author hms
 * @Date 2024/3/2 13:54
 * @Description TODO
 */
public class LC_2368 {

    public static int reachableNodes(int n, int[][] edges, int[] restricted) {

        Set<Integer> restrictedList = Arrays.stream(restricted).boxed().collect(Collectors.toSet());

        int[][] validEdges = new int[n][n];
        for (int i = 0; i < edges.length; i++) {
            if (!restrictedList.contains(edges[i][0]) && !restrictedList.contains(edges[i][1])) {
                validEdges[Math.min(edges[i][0], edges[i][1])][Math.max(edges[i][0], edges[i][1])] = 1;
                validEdges[Math.max(edges[i][0], edges[i][1])][Math.min(edges[i][0], edges[i][1])] = 1;
            }
        }
        Set<Integer> res = new HashSet<>();
        res.add(0);
        dfs(validEdges,0,res);
        return res.size();
    }

    public static void dfs(int[][] edges,int idx,Set<Integer> res) {
        for (int i = 0; i < edges[idx].length; i++) {
            if(edges[idx][i] == 0 || res.contains(i)){
                continue;
            }
            res.add(i);
            dfs(edges,i,res);
        }
    }

    public static void main(String[] args) {
        int[][] edges = ArrayHandler.toTwoDimensionIntArray("[[4,1],[1,3],[1,5],[0,5],[3,6],[8,4],[5,7],[6,9],[3,2]]");
        int i = reachableNodes(10, edges, ArrayHandler.toIntArray("[2,7]"));
        System.out.println(i);
    }
}
