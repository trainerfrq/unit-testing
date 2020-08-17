import com.training.model.ConversionOperation;
import com.training.model.Unit;
import com.training.parser.UnitSyntaxParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SyntaxParserTest {

    @Test
    public void testInitialAndTrailingSpacesShouldBeIgnored() {
        UnitSyntaxParser unitSyntaxParser = new UnitSyntaxParser();
        ConversionOperation parse = unitSyntaxParser.parse(" 13 kilometers to meters");
        ConversionOperation expectedConversionOperation = new ConversionOperation(13.0, Unit.KILOMETER, Unit.METER);
        assertEquals(expectedConversionOperation, parse);
    }
    @Test
    public void testNoValueShouldBeTreatedAsOneValue() {
        UnitSyntaxParser unitSyntaxParser = new UnitSyntaxParser();
        ConversionOperation parse = unitSyntaxParser.parse("kilometers to meters");
        ConversionOperation expectedConversionOperation = new ConversionOperation(1.0, Unit.KILOMETER, Unit.METER);
        assertEquals(expectedConversionOperation, parse);
    }

    @Test
    public void testNegativeValue() {
        UnitSyntaxParser unitSyntaxParser = new UnitSyntaxParser();
        ConversionOperation parse = unitSyntaxParser.parse("-10 kilometers to meters");
        ConversionOperation expectedConversionOperation = new ConversionOperation(-10.0, Unit.KILOMETER, Unit.METER);
        assertEquals(expectedConversionOperation, parse);
    }
}
