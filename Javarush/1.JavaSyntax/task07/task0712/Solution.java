package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        String max = "";
        String min = list.get(1);
        int x = 0;
        int y = 0;

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > max.length()) {max = list.get(i); x = i;}
            if (list.get(i).length() < min.length()) {min = list.get(i); y = i;}
        }

        if (x < y) System.out.println(list.get(x));
        else System.out.println(list.get(y));
    }
}
