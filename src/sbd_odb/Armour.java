package sbd_odb;

public class Armour extends Item {
	int defence;
	public Armour(int type_id,String name, int weight, int value, int defence){
		super(type_id,name, weight, value);
		this.defence = defence;
	}

	@Override
	public int use(Person target) {
		System.out.println("Thou cannot use armour in this way, consider equiping it!");
		return 0;
	}
	
	@Override
	public String show_str()
	{
		return "Typ: pancerz\t" + super.show_str() + "\tOchrona: " + defence;
	}

}
