package UnitTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StringUtilsTest {
	@ParameterizedTest
	@MethodSource
	void testCapitalize(String input, String result) {
	    assertEquals(result, StringUtils.capitalize(input));
	}
	
	static List<Arguments> testCapitalize(){
		return  new ArrayList<>(Arrays.asList( // arguments:
	              Arguments.of("abc", "Abc"), //
	              Arguments.of("APPLE", "Apple"), //
	              Arguments.of("gooD", "Good")
	            ));
	}
	
	@ParameterizedTest
	@CsvSource({ "abc, Abc", "APPLE, Apple", "gooD, Good" })
	void testCapitalize1(String input, String result) {
	    assertEquals(result, StringUtils.capitalize(input));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = { "/test-capitalize.csv" })
	void testCapitalizeUsingCsvFile(String input, String result) {
	    assertEquals(result, StringUtils.capitalize(input));
	}
}
