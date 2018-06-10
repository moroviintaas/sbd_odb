package sbd_odb;

public class Ability {
	
	String name;
	int restore_heatlh;
	int restore_force;
	int restore_stamina;
	int damage_heath;
	int damage_stamina;
	int damage_force;

	Ability(String name, int rh, int rf, int rs, int dh, int df, int ds)
	{
		this.name = name;
		this.restore_heatlh = rh;
		this.restore_force = rf;
		this.restore_stamina = rs;
		this.damage_heath = dh;
		this.damage_force = df;
		this.damage_stamina = ds;
	}
	
	void Cast(Person target)
	{
		target.change_hfs(restore_heatlh-damage_heath,restore_force-damage_force,restore_stamina-damage_stamina);
	}

}
