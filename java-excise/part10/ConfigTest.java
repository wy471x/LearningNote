package UnitTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
public class ConfigTest {
	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testWindows() {
	    Config config = new Config();
		assertEquals("C:\\test.ini", config.getConfigFile("test.ini"));
	}

	@Test
	@EnabledOnOs({ OS.LINUX, OS.MAC })
	void testLinuxAndMac() {
		Config config = new Config();
	    assertEquals("/usr/local/test.cfg", config.getConfigFile("test.cfg"));
	}
}
