package com.kiruha3.exception.hw;

import java.util.ArrayList;
import java.util.List;

public class hwTask2Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 71, 1, 2, 3, 4, 4, 5, 5, 6, 71, 1, 2, 3, 4, 4, 5, 5, 6, 71, 1, 2, 3, 4, 4, 5, 5, 6, 71, 1, 2, 3, 4, 4, 5, 5, 6, 71, 1, 2, 3, 4, 4, 5, 5, 6, 71, 1, 2, 3, 4, 4, 5, 5, 6, 71, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        evenNum(nums);
    }

    private static void evenNum(List<Integer> nums) {
        List<Integer> evenNums = new ArrayList<>();
        for (int num = 0; num < nums.size(); num++) {
            if (nums.get(num) % 2 == 0) {
                if (!evenNums.contains(nums.get(num))) {
                    evenNums.add(nums.get(num));
                }
            }
        }
        System.out.println(evenNums);
    }
}
