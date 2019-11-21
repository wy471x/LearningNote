package UnitTest;

import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UseParameterizedTest {
	@ParameterizedTest 
	@ValueSource(ints = { 0, 1, 5, 100 })
	void testAbs(int x) {
	    assertEquals(x, Math.abs(x));
	}
	
	
}
