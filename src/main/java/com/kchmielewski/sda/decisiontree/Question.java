package com.kchmielewski.sda.decisiontree;

import java.util.function.Predicate;

public class Question<Input, Output> implements DecisionTree<Input, Output> {

    public Question(Predicate<Input> predicate) {
    }

    @Override
    public Output ask(Input input) {
        return null;
    }

    @Override
    public void yes(DecisionTree<Input, Output> decisionTree) {

    }

    @Override
    public void no(DecisionTree<Input, Output> decisionTree) {

    }
}