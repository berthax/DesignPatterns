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
		System.out.println("��ɫ��Ϊ:"+characterName+"�Ľ�ɫ��ս������");
		getWeapon().useWeapon();
	}

}
