package com.kchmielewski.sda.decisiontree.example;

import com.kchmielewski.sda.decisiontree.Answer;
import com.kchmielewski.sda.decisiontree.Question;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Question<Integer, String> root = new Question<>(i -> i >= 0);
        root.no(new Answer<>("Number is negative"));
        Question<Integer, String> isEven = new Question<>(i -> i %2 == 0);
        root.yes(isEven);
        isEven.no(new Answer<>("Number is odd"));
        Question<Integer, String> isGreaterThan10 = new Question<>(i -> i > 10);
        isEven.yes(isGreaterThan10);
        isEven.no(new Answer<>("Number is less or equal to 10"));
        isEven.yes(new Answer<>("Number is greater than 10"));


        System.out.println(root.ask(-5));
        System.out.println(root.ask(0));
        System.out.println(root.ask(12));
        System.out.println(root.ask(8));
        System.out.println(root.ask(15));
    }
}
