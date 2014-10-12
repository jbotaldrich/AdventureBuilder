package skills;

import java.util.List;

import statrelated.CreatureAttribute;

public class SkillAttribute extends CreatureAttribute{

	private final List<Skill> skills;
	
	public SkillAttribute(List<Skill> skills) {
		this.skills = skills;
	}
}
