package sbd_odb;

public class Ability {
	
	int restore_heatlh;
	int restore_force;
	int restore_stamina;
	int damage_heath;
	int damage_stamina;
	int damage_force;

	
	void Cast(Person target)
	{
		target.change_hfs(restore_heatlh-damage_heath,restore_force-damage_force,restore_stamina-damage_stamina);
	}

}
