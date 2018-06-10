package sbd_odb;

public class Grenade extends Item {
	public int stacks;
	int health_damage;
	int force_damage;
	int stamina_damage;
	

	public Grenade(int type_id,String name, int weight, int value, int stacks, int health_damage,int force_damage,int stamina_damage) {
		super(type_id,name, weight, value);
		this.stacks =stacks;
		this.health_damage = health_damage;
		this.force_damage = force_damage;
		this.stamina_damage = stamina_damage;
		
	}
	
	@Override
	public int use(Person target) {
		if (stacks>0)
		{
			stacks--;
			System.out.println("Flying "+name+"!");
			System.out.println("You are left with " + Integer.toString(stacks) + "stacks.");
			target.change_hfs(-health_damage, -force_damage, -stamina_damage);
			return 0;
		}
		else
		{
			System.out.println("Sir... I am afraid you disposed of all thy stacks of "+name+".");
			return -1;
		}

	}
	@Override
	public String show_str()
	{
		return "Typ: granat\t" + super.show_str() + "\tObrażenia fizyczne: " + health_damage + "\tObrażenia na moc: " + force_damage + "\tObrażenia na kondycję: " + stamina_damage + "\tZapas: "+ Integer.toString(stacks);
	}

}
