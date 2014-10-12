package statrelated;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class BasicStatsTest {

	@Test
	public void testBasicStatsBuild() {
		Map<StatType, CreatureStatAttribute> sc = new HashMap<StatType, CreatureStatAttribute>();
		
		sc.put(StatType.STR, new CreatureStatAttribute(new StatAttribute(StatType.STR, 15)));
		sc.put(StatType.DEX, new CreatureStatAttribute(new StatAttribute(StatType.DEX, 12)));
		BasicStats basic = new BasicStats(sc);
		
		assertEquals(2, basic.getStat(StatType.STR).getModifier());
		assertEquals(12, basic.getStat(StatType.DEX).getStatValue());
	}
}
