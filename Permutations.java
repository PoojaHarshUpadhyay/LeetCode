package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> choose = new ArrayList<>();
        Integer[] tempNum = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tempNum[i] = nums[i];
        }
        if (tempNum.length == 1) {
            answer.add(Arrays.asList(tempNum));
            return answer;
        }
        List<Integer> tempNumList = new ArrayList<>(Arrays.asList(tempNum));
        calculateEverythingWithBacktracking(tempNumList, choose, answer);
        return answer;
    }

    static void calculateEverythingWithBacktracking(List<Integer> nums, List<Integer> choose, List<List<Integer>> answer) {
        if (nums.size() == 0) {
            answer.add(new ArrayList<>(choose));
        } else {
            for (int i = 0; i < nums.size(); i++) {
                //choose the remaining values except the index and add them in list
                int temp = nums.get(i);
                nums.remove(i);
                choose.add(temp);

                //explore
                calculateEverythingWithBacktracking(nums, choose, answer);

                //un choose 
                choose.remove(choose.size()-1);
                nums.add(i, temp);
            }
        }
    }
}
