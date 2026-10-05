package com.example;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String[] strings = {"Hello", "World"};
        System.out.println(StringUtils.join(strings, '-'));
    }
}
