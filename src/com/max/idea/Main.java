package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Ввести текст:");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        boolean isAll = true;
        if(s.contains("Java"))
        {
            System.out.println("Есть");
        }
        else
        {
            isAll &= false;
        }
        if(s.startsWith("I like"))
        {
            System.out.println("Есть");
        }
        else
        {
            isAll &= false;
        }
        if(s.endsWith("!!!"))
        {
            System.out.println("Есть");
        }
        else
        {
            isAll &= false;
        }
        if(isAll)
        {
            String t = s.toUpperCase();
            System.out.println(t);
        }
        s = s.replace('a', 'o');
        String t = s.substring(7, 11);
        System.out.println(t);
    }
}
