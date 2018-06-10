package sbd_odb;

public abstract class Item {
	public String name;
	int weight;
	int value;
	
	
	
	public Item(String name, int weight, int value)
	{
		this.name = name;
		this.weight = weight;
		this.value = value;
	}
	public abstract void use();

}
