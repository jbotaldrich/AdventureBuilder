package statrelated;


public class StatAttribute {
	private final StatType statType;
	private final int statValue;

	
	public StatAttribute(StatType statType, int statValue) {
		this.statType = statType;
		this.statValue = statValue;
	}


	public StatType getStatType() {
		return statType;
	}


	public int getStatValue() {
		return statValue;
	}


}
