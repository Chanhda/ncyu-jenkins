import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GradeConverterTest {
    private GradeConverter converter;
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }
    @Test
    public void testConvert() {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert2() {
        String expected = "A";
        String actual = converter.convert(60);
        assertEquals(expected, actual);
    }
}
