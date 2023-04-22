package org.example.hw230420.task4;

import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        ArrayList<Integer> someList = new ArrayList<>();
        for (int i=0; i < 10; i++){
            someList.add(generateRandomInt(10));
        }
        System.out.println(someList);

        int min = Collections.min(someList);
        int max = Collections.max(someList);
        int sum = 0;
        float average = 0.0F;
        for (int value : someList){
            sum += value;
        }
        average = (float) sum /someList.size();
        System.out.println("min: " + min + "\nmax: " + max + "\naverage: " + average);
    }

    public static int generateRandomInt(int upperValue){
        Random random = new Random();
        return random.nextInt(upperValue);
    }
}
