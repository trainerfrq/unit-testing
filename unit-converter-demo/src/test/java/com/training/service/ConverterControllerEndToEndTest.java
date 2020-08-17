package com.training.service;

import com.training.parser.UnitSyntaxParser;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterControllerEndToEndTest {

    @Test
    public void testEndToEndKilometres() {
        UnitSyntaxParser unitSyntaxParser = new UnitSyntaxParser();
        UnitConverter unitConverter = new UnitConverter();
        ConverterController converterController = new ConverterController(unitSyntaxParser, unitConverter);
        assertEquals("4.63 nm", converterController.convertFromString("9.26 km to nm"));

    }
}