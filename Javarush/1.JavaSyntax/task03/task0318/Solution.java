package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(bf.readLine());
        String name = bf.readLine();

        System.out.println(name + " захватит мир через "+age+" лет. Му-ха-ха!");
    }
}
