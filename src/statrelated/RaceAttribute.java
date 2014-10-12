package statrelated;

import java.util.Map;

public class RaceAttribute implements AbilityStatModifier {

	private Map<StatType, StatAttribute> racialAbilityModifier;
	
	
	
	@Override
	public int getAbilityModifier(StatType statType) {
		if(racialAbilityModifier.containsKey(statType)) {
			return racialAbilityModifier.get(statType).getStatValue();
		}
		return 0;
	}

	
}
