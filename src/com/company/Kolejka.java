package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Kolejka {
    public static void main(String[] args) {

        int[] tab = {1, 5, 22, 17, 3, 18, 11, 4, 15, 5, 7, 2, 9, 11, 12, 5, 1, 18};
        Stack<Integer> stos = new Stack<Integer>();
        for (int liczba : tab)
            stos.push(liczba);
        for (int i = 1; i <10; i++){
            int x = (int) stos.pop();
            System.out.println(x + ", ");
        }
        System.out.println();
        while (!stos.isEmpty())
            System.out.println(stos.pop() + ", ");
      //  Queue<Integer> kolejka2 = new ArrayDeque<>();
      //  for(int liczba)
        System.out.println();
    // zrobić jeszcze kolejkę

    }
}