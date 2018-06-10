package sbd_odb;

public class Potion extends Item {

	int stacks;
	int toxicity;
	
	int ammount_of_restored_health;
	int ammount_of_restored_force;
	int ammount_of_restored_stamina;
	
	public Potion(String name, int weight, int value) {
		super(name, weight, value);
		// TODO Auto-generated constructor stub
	}
	public Potion(String name, int weight, int value, int stacks, int health, int force, int stamina, int toxicity) {
		super(name, weight, value);
		this.stacks =stacks;
		
		this.ammount_of_restored_force = force;
		this.ammount_of_restored_health = health;
		this.ammount_of_restored_stamina = stamina;
		this.toxicity = toxicity;
		
	}

	
	
	@Override
	public void use() {
		if (stacks>0)
		{
			stacks--;
			System.out.println("Drinking "+name+"!");
			System.out.println("You are left with " + Integer.toString(stacks) + "stacks.");
		}
		else
		{
			System.out.println("Sir... Thy stack of "+name+" is empty.");
		}
	}

}
