package statrelated;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class StatAttributeTest {
	
	@Test
	public void testBuild() {
		StatAttribute sa = new StatAttribute(StatType.STR, 10);
		
		assertEquals(10, sa.getStatValue());
		assertEquals(StatType.STR, sa.getStatType());
	}
}
