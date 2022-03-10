package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add(random.nextInt(12, 35));

        }
        System.out.println(set);

        int counter = 0;
        for (Integer integer : set) {
            counter++;
        }
        System.out.println(counter);


        }
   }


