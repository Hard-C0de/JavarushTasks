package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int count = 0;
        for(int ch = 0; ch < alphabet.size(); ch++) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).length(); j++) {
                    if(alphabet.get(ch).equals(list.get(i).charAt(j)))
                        count++;
                }
            }
            System.out.println(alphabet.get(ch) + " " + count);
            count = 0;
        }
    }

}
