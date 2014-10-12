package statrelated;

public enum StatType {
	CHA("charisma"),
	INT("intelligence"),
	STR("strength"),
	DEX("dexterity"),
	WIS("wisdom"),
	CON("constitution");
	
	private String value;
	
	private StatType(String value){
		this.value = value;
	}
	
	public String toString() {
		return value;
	}
	
}
