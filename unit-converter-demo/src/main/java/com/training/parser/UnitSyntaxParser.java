package com.training.parser;

import com.training.model.ConversionOperation;
import com.training.model.UnitRepresentations;

public class UnitSyntaxParser {

    public ConversionOperation parse(String toBeConverted) {
        String[] parsedString = toBeConverted.trim().split(" to ");
        String valueAndFrom = parsedString[0];
        String from = valueAndFrom;
        String firstWord = extractFirstWord(valueAndFrom);
        String defaultValue = "1";
        String stringValue = defaultValue;
        if (!(firstWord.matches("(-)?[0-9]{1,200}(\\.)?[0-9]{1,200}"))) {
            from = valueAndFrom;
        } else {
            stringValue= valueAndFrom.substring(0, valueAndFrom.indexOf(" "));
            from = valueAndFrom.substring(valueAndFrom.indexOf(" "));
        }
        String to = parsedString[1];
        return new ConversionOperation(Double.parseDouble(stringValue), UnitRepresentations.getUnit(from),
                UnitRepresentations.getUnit(to));
    }

    private String extractFirstWord(String valueAndFrom) {
        if(valueAndFrom.contains(" ")) {
            return valueAndFrom.substring(0, valueAndFrom.indexOf(" "));
        }
        return valueAndFrom;
    }

}
