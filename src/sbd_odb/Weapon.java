package sbd_odb;

public class Weapon extends Item {

	int damage;
	public Weapon(int type_id,String name, int weight, int value, int damage) {
		super(type_id, name, weight, value);
		this.damage = damage;
	}

	@Override
	public int use(Person target) {
		System.out.println("Thou cannot use the weapon. Thou may want to equip it, then start killing.");
		return 0;
	}
	
	@Override
	public String show_str()
	{
		return "Typ: broń\t" + super.show_str() + "\tObrażenia: " + damage;
	}

}
