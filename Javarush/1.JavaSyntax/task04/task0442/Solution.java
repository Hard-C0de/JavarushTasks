package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        while(true) {
            int a = Integer.parseInt(r.readLine());
            sum = sum + a;
            if(a == -1)
                break;
        }
        System.out.println(sum);
    }
}
