package sbd_odb;

public class Armour extends Item {

	public Armour(String name, int weight, int value){
		super(name, weight, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void use() {
		System.out.println("Thou cannot use armour in this way, consider equiping it!");

	}

}
