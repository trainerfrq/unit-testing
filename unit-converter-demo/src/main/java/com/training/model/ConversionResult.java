package com.training.model;

import java.util.Objects;

public class ConversionResult {
    private double value;
    private Unit unit;

    public ConversionResult(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConversionResult)) {
            return false;
        }
        ConversionResult that = (ConversionResult) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        return
                 value +
                " " + UnitRepresentations.getRepresentation(this.unit)
                ;
    }
}
