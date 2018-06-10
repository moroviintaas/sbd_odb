package sbd_odb;

public class Potion extends Item {

	int stacks;
	int toxicity;
	
	int ammount_of_restored_health;
	int ammount_of_restored_force;
	int ammount_of_restored_stamina;
	
	//public Potion(int type_id,String name, int weight, int value) {
		//super(type_id,name, weight, value);
		// TODO Auto-generated constructor stub
//	}
	public Potion(int type_id,String name, int weight, int value, int stacks, int health, int force, int stamina, int toxicity) {
		super(type_id,name, weight, value);
		this.stacks =stacks;
		
		this.ammount_of_restored_force = force;
		this.ammount_of_restored_health = health;
		this.ammount_of_restored_stamina = stamina;
		this.toxicity = toxicity;
		
	}

	
	
	@Override
	public int use(Person target) {
		if (stacks>0)
		{
			stacks--;
			System.out.println("Drinking "+name+"!");
			System.out.println("You are left with " + Integer.toString(stacks) + "stacks.");
			target.change_hfs(ammount_of_restored_health, ammount_of_restored_force, ammount_of_restored_stamina);
			target.toxify(toxicity);
			return 0;
		}
		else
		{
			System.out.println("Sir... Thy stack of "+name+" is empty.");
			return -1;
		}
	}
	@Override
	public String show_str()
	{
		return "Typ: mikstura\t" + super.show_str() + "\tPrzywracane zdrowie: " + ammount_of_restored_health + "\tPrzywracana moc: " + ammount_of_restored_force + "\tPrzywracana kondycja: " + ammount_of_restored_stamina + "\tZapas: "+ Integer.toString(stacks);
	}

}
