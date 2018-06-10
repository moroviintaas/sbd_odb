package sbd_odb;

public class Weapon extends Item {

	public Weapon(String name, int weight, int value) {
		super(name, weight, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {
		System.out.println("Thou cannot use the weapon. Thou may want to equip it, then start killing.");

	}

}
