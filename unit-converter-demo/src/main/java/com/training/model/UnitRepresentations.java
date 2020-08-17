package com.training.model;

import java.util.Arrays;
import java.util.List;


public enum UnitRepresentations {
    KILOMETERS(Unit.KILOMETER, "km", "kilometers"),
    INCHES(Unit.INCH, "in", "inches"),
    NAUTICAL_MILES(Unit.NAUTICAL_MILE, "nm", "nautical miles"),
    METERS(Unit.METER, "m", "meters");

    private final Unit unit;
    private final List<String> representations;

    UnitRepresentations(Unit unit, String... representations) {
        this.unit = unit;
        this.representations = Arrays.asList(representations);
    }

    public static Unit getUnit(String representation) {
       return Arrays.stream(UnitRepresentations.values()).filter(ur -> ur.representations.contains(representation.trim())).findFirst().orElseThrow(() -> new RuntimeException("Unit representation not found")).unit;
    }

    public static String getRepresentation(Unit unit) {
        return Arrays.stream(UnitRepresentations.values()).filter(ur -> ur.unit.equals(unit)).findFirst().orElseThrow(() -> new RuntimeException("Unit representation not found")).representations.get(0);
    }
}
