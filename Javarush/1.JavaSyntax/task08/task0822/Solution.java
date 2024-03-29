package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for(int i = 0; i < array.size(); i++)
            if(array.get(i) < min)
                min = array.get(i);
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < N; i++)
            result.add(Integer.parseInt(r.readLine()));
        return result;
    }
}
