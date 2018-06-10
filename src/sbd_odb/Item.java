package sbd_odb;

public abstract class Item {
	protected String name;
	protected String name2;
	private int weight;
	private int value;
	int type_id;
	
	
	
	public Item(int type_id,String name, int weight, int value)
	{
		this.type_id = type_id;
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.name2 = name + name;
	}
	public abstract int use(Person target);
	public String show_str()
	{
		return "Nazwa: " + name;
	}

}
