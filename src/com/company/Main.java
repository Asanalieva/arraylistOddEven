package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            arrayList.add(random.nextInt(1, 101));

        }
        System.out.println(arrayList); //all integers

        //even integers
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for(int i : arrayList){
            if(i % 2 ==0){
                arrayList1.add(i);
            }
        }
        System.out.println("Even integers: "+arrayList1+" ");

        //odd integers
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(int i : arrayList){
            if(i % 2 !=0){
                arrayList2.add(i);
            }
        }
        System.out.println("Odd integers: "+arrayList2+" ");
    }
}
