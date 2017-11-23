package com.kchmielewski.sda.decisiontree;

public interface DecisionTree<Input, Output> {
    Output proceedWithInput(Input input);

    void setYesDecisionTree(DecisionTree<Input, Output> decisionTree);

    void setNoDecisionTree(DecisionTree<Input, Output> decisionTree);
}
