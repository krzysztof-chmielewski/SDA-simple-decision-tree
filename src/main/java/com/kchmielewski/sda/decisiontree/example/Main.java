package com.kchmielewski.sda.decisiontree.example;

import com.kchmielewski.sda.decisiontree.Answer;
import com.kchmielewski.sda.decisiontree.DecisionTree;
import com.kchmielewski.sda.decisiontree.Question;

public class Main {
    public static void main(String[] args) {
        DecisionTree<Integer, String> root = new Question<>(i -> i >= 0);
        DecisionTree<Integer, String> isEven = new Question<>(i -> i %2 == 0);
        DecisionTree<Integer, String> answerIsNegative = new Answer<>("Number is negative");
        root.setNoDecisionTree(answerIsNegative);
        root.setYesDecisionTree(isEven);

        DecisionTree<Integer, String> isGreaterThan10 = new Question<>(i -> i > 10);
        isEven.setNoDecisionTree(new Answer<>("Number is odd"));
        isEven.setYesDecisionTree(isGreaterThan10);

        isEven.setNoDecisionTree(new Answer<>("Number is less or equal to 10"));
        isEven.setYesDecisionTree(new Answer<>("Number is greater than 10"));


        System.out.println(root.ask(-5));
        System.out.println(root.ask(0));
        System.out.println(root.ask(12));
        System.out.println(root.ask(8));
        System.out.println(root.ask(15));
    }
}
