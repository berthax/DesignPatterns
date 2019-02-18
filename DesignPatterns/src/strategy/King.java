package strategy;

public class King extends Character {

	public King() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public King(String characterName) {
		this.characterName = characterName;
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("角色名为:"+characterName+"的角色在战斗……");
		this.weapon.useWeapon();
	}

}
