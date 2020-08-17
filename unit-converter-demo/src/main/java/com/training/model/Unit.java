package com.training.model;

public enum Unit {

    KILOMETER(UnitType.DISTANCE, 0.001),
    INCH(UnitType.DISTANCE, 39.37),
    NAUTICAL_MILE(UnitType.DISTANCE, 0.0005),
    METER(UnitType.DISTANCE, 1);

    private UnitType unitType;
    private double ratioToReference;

    Unit(UnitType unitType, double ratioToReference) {
        this.unitType = unitType;
        this.ratioToReference = ratioToReference;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public double getRatioToReference() {
        return ratioToReference;
    }
}
