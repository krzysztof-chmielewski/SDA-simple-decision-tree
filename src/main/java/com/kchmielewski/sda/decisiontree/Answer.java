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
    public void setYesDecisionTree(DecisionTree<Input, Output> decisionTree) {

    }

    @Override
    public void setNoDecisionTree(DecisionTree<Input, Output> decisionTree) {

    }
}
