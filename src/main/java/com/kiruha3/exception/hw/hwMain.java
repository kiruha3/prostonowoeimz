package com.kiruha3.exception.hw;

import java.util.ArrayList;
import java.util.List;

public class hwMain {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        oddNum(nums);
    }
    public static void oddNum(List<Integer> nums) {
        List<Integer> oddNums = new ArrayList<>();
        for (int num = 0; num < nums.size(); num++) {
            if (nums.get(num) % 2 != 0) {
                oddNums.add(nums.get(num));
            }
        }
        System.out.println(oddNums);

    }

}
