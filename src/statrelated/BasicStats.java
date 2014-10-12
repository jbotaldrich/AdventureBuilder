package statrelated;

import java.util.Map;

public class BasicStats{
	
	private Map<StatType, CreatureStatAttribute> stats;
	
	public BasicStats(Map<StatType, CreatureStatAttribute> stats) {
		this.stats = stats;
	}

	public CreatureStatAttribute getStat(StatType statType) {
		return stats.get(statType);
	}

	
	
	
}
