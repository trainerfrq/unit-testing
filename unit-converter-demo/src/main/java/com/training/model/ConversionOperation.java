package com.training.model;

import java.util.Objects;

public class ConversionOperation {
    private double value;
    private Unit from;
    private Unit to;

    public ConversionOperation(double value, Unit from, Unit to) {
        this.value = value;
        this.from = from;
        this.to = to;
    }

    public double getValue() {
        return value;
    }

    public Unit getFrom() {
        return from;
    }

    public Unit getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConversionOperation)) {
            return false;
        }
        ConversionOperation that = (ConversionOperation) o;
        return Double.compare(that.value, value) == 0 &&
                from == that.from &&
                to == that.to;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, from, to);
    }
}
