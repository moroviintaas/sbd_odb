package sbd_odb;

public class Grenade extends Item {
	public int stacks;
	
	
	public Grenade(String name, int weight, int value) {
		super(name, weight, value);
		this.stacks =0;
		
	}
	public Grenade(String name, int weight, int value, int stacks) {
		super(name, weight, value);
		this.stacks =stacks;
		
	}
	
	@Override
	public void use() {
		if (stacks>0)
		{
			stacks--;
			System.out.println("Flying "+name+"!");
			System.out.println("You are left with " + Integer.toString(stacks) + "stacks.");
		}
		else
		{
			System.out.println("Sir... I am afraid you disposed of all thy stacks of "+name+".");
		}

	}

}
