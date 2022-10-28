package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int input = sc.nextInt();
            if (list.contains(input))
            {
                list.remove((Integer) input);
            }
            list.addFirst(input);
        }
        System.out.println(list);
    }
}
