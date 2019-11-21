package UnitTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class DoubleTest {
 @Test
 void testDouble() {
	 assertEquals(0.1,Math.abs(1 - 9 / 10.0),0.0000000001);
 }
}
