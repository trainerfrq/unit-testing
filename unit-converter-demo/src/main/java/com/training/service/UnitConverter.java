package com.training.service;

import com.training.model.ConversionOperation;
import com.training.model.ConversionResult;

public class UnitConverter {
    public ConversionResult convert(ConversionOperation conversionOperation) {
        if (!conversionOperation.getFrom().getUnitType()
                                .equals(conversionOperation.getTo().getUnitType())) {
            throw new RuntimeException("Incompatible unit types");
        }
        double resultValue = conversionOperation.getValue() * conversionOperation.getTo().getRatioToReference()
                / conversionOperation.getFrom().getRatioToReference();
        return new ConversionResult(resultValue, conversionOperation.getTo());
    }
}
