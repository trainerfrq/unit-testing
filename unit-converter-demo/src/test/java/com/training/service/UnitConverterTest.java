package com.training.service;

import com.training.model.ConversionOperation;
import com.training.model.ConversionResult;
import com.training.model.Unit;
import com.training.model.UnitType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitConverterTest {

    @Test
    public void convertKilometerToMeter() {
        UnitConverter unitConverter = new UnitConverter();
        ConversionOperation conversionOperation = new ConversionOperation(14, Unit.KILOMETER, Unit.METER);
        ConversionResult convert = unitConverter.convert(conversionOperation);
        ConversionResult expected = new ConversionResult(14000.0, Unit.METER);
        assertEquals(expected, convert);
    }
}