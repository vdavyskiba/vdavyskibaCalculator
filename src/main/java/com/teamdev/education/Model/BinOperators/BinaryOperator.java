package com.teamdev.education.Model.BinOperators;

import java.math.BigDecimal;
import java.util.LinkedList;

public abstract class BinaryOperator {
    public final Number priority;

    public BinaryOperator(Number priority) {
        this.priority = priority;
    }

    public abstract BigDecimal execute (LinkedList<BigDecimal> bigDecimals);

}
