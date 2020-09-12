package com.shenzeyu.practice.leetcode;

public class Solution {

    private int n = 3;
    private int N = n * n;
    private char[][] board;

    private int[][] rows = new int[N][N + 1];
    private int[][] cols = new int[N][N + 1];
    private int[][] boxs = new int[N][N + 1];

    public void solveSudoku(char[][] board) {
        this.board = board;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                char num = board[i][j];
                if (num != '.') {
                    int d = Character.getNumericValue(num);
                    placeNum(d, i, j);
                }
            }
        }

    }


    private void placeNum(int d, int row, int col) {
        int idx = (row / n) * n + col / n;

        rows[row][d]++;
        cols[col][d]++;
        boxs[idx][d]++;
        board[row][col] = (char) (d + '0');
    }

}
