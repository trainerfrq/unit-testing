package com.training.service;

import com.training.model.ConversionOperation;
import com.training.model.ConversionResult;
import com.training.parser.UnitSyntaxParser;
import com.training.service.UnitConverter;

public class ConverterController {

    private final UnitSyntaxParser unitSyntaxParser;
    private final UnitConverter unitConverter;

    public ConverterController(UnitSyntaxParser unitSyntaxParser, UnitConverter unitConverter) {
        this.unitSyntaxParser = unitSyntaxParser;
        this.unitConverter = unitConverter;
    }

    public String convertFromString(String toBeConverted){
        ConversionOperation conversionOperation = unitSyntaxParser.parse(toBeConverted);
        ConversionResult conversionResult = unitConverter.convert(conversionOperation);
        return conversionResult.toString();
    }
}
