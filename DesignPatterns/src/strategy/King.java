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
		System.out.println("��ɫ��Ϊ:"+characterName+"�Ľ�ɫ��ս������");
		this.weapon.useWeapon();
	}

}
