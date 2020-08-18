package com.udemy.example1.Spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private BinarySeach binarySeach;

    public int binarySearch(int[] numbers, int numberToSearchFor){

        int [] sortedNumbers = binarySeach.sort(numbers);
        System.out.println(binarySeach);

        //Implementing Sorting Logic

        //Bubble Sort Algorithm

        //Quick Sort Algorithm

        //Search the array

        return 3;
    }

    //Sort an array
    //Search the array
    //Return the array



}
