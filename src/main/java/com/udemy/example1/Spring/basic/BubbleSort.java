package com.udemy.example1.Spring.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BubbleSort implements BinarySeach{

    public int[] sort(int[] numbers){
        //Logic for Bubble Sort
        return numbers;
    }
}
