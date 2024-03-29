package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.LambdaConversionException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new Exception();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException();
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NegativeArraySizeException();
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchFieldException();
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchMethodException();
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new NoSuchElementException();
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IOException();
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new FileNotFoundException();
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new LambdaConversionException();
        } catch(Exception e) {
            exceptions.add(e);
        }
    }
}
