package com.training.service;

import com.training.parser.UnitSyntaxParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ParameterizedTest {
    @Parameterized.Parameter(0)
     public String input;
    @Parameterized.Parameter(1)
     public String output;
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
                {"5 kilograms to ounces", "300"},
                {"13 meters to kilometers", " 0.013 km"},
                {"0.013 kilometers to meters", "13 m"},
        };
        return Arrays.asList(data);
    }
    @Test
    public void testEndToEndKilometres() {

        UnitSyntaxParser unitSyntaxParser = new UnitSyntaxParser();
        UnitConverter unitConverter = new UnitConverter();
        ConverterController converterController = new ConverterController(unitSyntaxParser, unitConverter);
        assertEquals(this.output, converterController.convertFromString(this.input));

    }
}
