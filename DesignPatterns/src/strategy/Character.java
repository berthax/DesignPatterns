package strategy;

public abstract class Character {
	/**
	 * ���������
	 */
	protected String characterName;
	/**
	 * ���ܷ����仯����Ϊ��������ӿڱ�̣���������ʱ�ı䣬����Ϸ�н�ɫ������
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
