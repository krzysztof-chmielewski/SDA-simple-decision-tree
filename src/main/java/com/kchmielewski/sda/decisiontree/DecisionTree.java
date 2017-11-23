package com.kchmielewski.sda.decisiontree;

public interface DecisionTree<Input, Output> {
    Output ask(Input input);

    void yes(DecisionTree<Input, Output> decisionTree);

    void no(DecisionTree<Input, Output> decisionTree);
}
