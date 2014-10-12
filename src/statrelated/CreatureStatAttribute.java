package statrelated;

import java.util.ArrayList;
import java.util.List;

public class CreatureStatAttribute {
	private static int AVERAGE_STAT_VALUE = 10;
	private static int MODIFIER_INCREMENT = 2;
	private List<AbilityStatModifier> abilityStatModifiers;
	private final StatAttribute baseAbility;
	
	public CreatureStatAttribute(StatAttribute baseAbility, List<AbilityStatModifier> abilityStatModifiers) {
		this.baseAbility = baseAbility;
		this.abilityStatModifiers = abilityStatModifiers;
	}
	
	public CreatureStatAttribute(StatAttribute baseAbility) {
		this.baseAbility = baseAbility;
		this.abilityStatModifiers = new ArrayList<AbilityStatModifier>();
	}
	

	public void subscribeStatModifiers(AbilityStatModifier cAttribute) {
		if(!abilityStatModifiers.contains(cAttribute)) {
			abilityStatModifiers.add(cAttribute);
		}
	}
	
	public void unsubscribeStatModifiers(AbilityStatModifier cAttribute) {
		if(abilityStatModifiers.contains(cAttribute)) {
			abilityStatModifiers.remove(cAttribute);
		}
	}
	
	public int getModifier() {
		return (this.getStatValue() - AVERAGE_STAT_VALUE) / MODIFIER_INCREMENT;
	}

	public int getStatValue() {
		int tempStatValue = baseAbility.getStatValue();
		for(AbilityStatModifier statModifier : abilityStatModifiers) {
			tempStatValue += statModifier.getAbilityModifier(baseAbility.getStatType());
		}
		return tempStatValue;
	}
}
