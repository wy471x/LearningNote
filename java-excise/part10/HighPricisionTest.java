package UnitTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
public class HighPricisionTest {
	  HighPricision highpricision;
	  @BeforeEach
	  public void start() {
		  this.highpricision = new HighPricision();
	  }
	  @AfterEach
	  public void end() {
		  this.highpricision = null;
	  }
      @Test
      void testAdd() {
    	  assertEquals(3.0d,this.highpricision.add(2.0),0.0000001);
    	  assertEquals(4.0d,this.highpricision.add(3.0),0.0000001);
      }
      @Test
      void testSub() {
    	  assertEquals(-1.0d,this.highpricision.sub(2.0),0.0000001);
    	  assertEquals(-2.0d,this.highpricision.sub(3.0),0.0000001);
      }
      @Test
      void testMul() {
    	  assertEquals(2.0d,this.highpricision.mul(2.0),0.0000001);
    	  assertEquals(3.0d,this.highpricision.mul(3.0),0.0000001);
      }
      @Test
      void testDiv() {
    	  assertEquals(0.5d,this.highpricision.div(2.0),0.0000001);
    	  assertEquals(0.33333333d,this.highpricision.div(3.0),0.0000001);
      }
}
