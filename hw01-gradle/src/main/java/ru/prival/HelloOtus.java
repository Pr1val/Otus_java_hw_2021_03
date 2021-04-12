package ru.prival;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class HelloOtus {
    public static void main(String... args) {
        List<Integer> fibonachi = new ArrayList<>();

        int prev = 1;
        int current = 1;
        int amount = 30;
        for (int i = 1; i <= amount; i++) {
            fibonachi.add(current);
            if (i > 2) prev = current - prev;
            current = prev + current;

        }
        System.out.println(Lists.reverse(fibonachi));
    }
}
