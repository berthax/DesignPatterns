package strategy;

public class Queen extends Character {

	public Queen() {
		super();
		setCharacterName("Queen");
	}

	public Queen(String characterName) {
		this.characterName = characterName;
	}
	
	@Override
	public void fight() {
		System.out.println("角色名为:"+characterName+"的角色在战斗……");
		getWeapon().useWeapon();
	}

}
