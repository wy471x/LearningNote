package UnitTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
public class UsuallConditionTest {
	@Test
	@DisabledOnOs(OS.WINDOWS)
	void testOnNonWindowsOs() {
	    // TODO: this test is disabled on windows
	}
	@Test
	@DisabledOnJre(JRE.JAVA_8)
	void testOnJava9OrAbove() {
	    // TODO: this test is disabled on java 8
	}
	@Test
	@EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
	void testOnlyOn64bitSystem() {
	    // TODO: this test is only run on 64 bit system
	}
	@Test
	@EnabledIfEnvironmentVariable(named = "DEBUG", matches = "true")
	void testOnlyOnDebugMode() {
	    // TODO: this test is only run on DEBUG=true
	}
	@Test
	@EnabledIf("java.time.LocalDate.now().getDayOfWeek()==java.time.DayOfWeek.SUNDAY")
	void testOnlyOnSunday() {
	    // TODO: this test is only run on Sunday
	}
	
}
