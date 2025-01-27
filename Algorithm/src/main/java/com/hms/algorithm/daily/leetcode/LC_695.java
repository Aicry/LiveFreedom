package com.hms.algorithm.daily.leetcode;

import com.hms.algorithm.daily.utils.ArrayHandler;

/**
 * @Author Hms
 * @Date 2024/08/27 21:33
 **/
public class LC_695 {

    int count;
    int[] di = {0, 0, 1, -1};
    int[] dj = {1, -1, 0, 0};

    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[0].length; i1++) {
                if (grid[i][i1] == 0) continue;
                count = 0;
                dfs(grid, i, i1);
                res = Math.max(res, count);
            }
        }
        return res;
    }

    public void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 0;
        count++;
        for (int index = 0; index != 4; ++index) {
            int next_i = i + di[index], next_j = j + dj[index];
            dfs(grid, next_i, next_j);
        }
    }

    public static void main(String[] args) {
        String input = "[[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]]";
        int[][] twoDimensionIntArray = ArrayHandler.toTwoDimensionIntArray(input);
        LC_695 lc695 = new LC_695();
        System.out.println(lc695.maxAreaOfIsland(twoDimensionIntArray));
    }
}
