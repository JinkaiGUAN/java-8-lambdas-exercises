package com.insightfullogic.java8.exercises.chapter2;

import com.insightfullogic.java8.exercises.Exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Question2 {

    public static ThreadLocal<DateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("dd-MMM" +
            "-yyyy"));

    public static void main(String[] args) {

    }

}
