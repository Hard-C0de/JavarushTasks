package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++)
            list.add(r.readLine());

        list.remove(2);

        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(list.size() - i - 1));
    }
}


