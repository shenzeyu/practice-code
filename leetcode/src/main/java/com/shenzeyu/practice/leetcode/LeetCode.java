package com.shenzeyu.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Program practice-code
 * @Description leetCode代码
 * @Author shenzeyu
 * @Date 2020/5/20 5:53 下午
 */
public class LeetCode {

    /**
     * 两数之和
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     * 示例:
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public int[] numsAdd(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            map.put(nums[i], i);
            int comNum = target - nums[i];
            if (map.containsKey(comNum) && map.get(comNum) != i) {
                return new int[] {i, map.get(comNum)};
            }
        }
        return new int[] {-1, -1};
    }

    /**
     * 给定一个单链表，对这个单链表进行排序，要求时间复杂度O（nlogn），空间复杂度O（1）
     *
     * 快速排序和归并排序
     * https://github.com/morethink/algorithm/blob/master/src/main/java/algorithm/leetcode/L_148_SortList.java
     */
    public void sortList() {
        //快速排序


    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        LeetCode leetCode = new LeetCode();
        leetCode.numsAdd(null, 12);
    }
}
