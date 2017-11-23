package com.kchmielewski.sda.decisiontree;

import java.util.function.Predicate;

public class Answer<Input, Output> implements DecisionTree<Input, Output> {

    public Answer(Output answer) {
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
