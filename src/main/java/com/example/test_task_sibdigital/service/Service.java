package com.example.test_task_sibdigital.service;

import java.util.ArrayList;

@org.springframework.stereotype.Service
public class Service {

    public static Long[] getLongArrayFromString(String strArray) {
        ArrayList<Long> arrayList = new ArrayList<>();
        String[] splittedStrings = strArray.split(" ");

        for (int i = 0; i < splittedStrings.length; i++) {
            if (splittedStrings[i].matches("-?[1-9]\\d*|0")) {
                arrayList.add(Long.parseLong(splittedStrings[i]));
            }
        }

        Long[] longArray = new Long[arrayList.size()];
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = arrayList.get(i);
        }
        return longArray;
    }

    public static void bubbleSort(Long[] array) {
        boolean sorted = false;
        Long temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
