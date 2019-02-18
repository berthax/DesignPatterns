package strategy;

public abstract class Character {
	/**
	 * 不变的属性
	 */
	protected String characterName;
	/**
	 * 可能发生变化的行为——面向接口编程，可在运行时改变，如游戏中角色换武器
	 */
	public WeaponBehavior weapon;
	
	public abstract void fight();
	public WeaponBehavior getWeapon() {
		return weapon;
	}
	public void setWeapon(WeaponBehavior weaponBehavior) {
		this.weapon = weaponBehavior;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
}
