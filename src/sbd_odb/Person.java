package sbd_odb;

import java.util.LinkedList;

public class Person {

	String name;
	
	int health;
	int stamina;
	int force;
	
	int strength;
	int endurance;
	int inteligence;
	int dexterity;
	int agility;
	int personality;
	int faith;
	
	Boolean alive;
	
	LinkedList<Item> equipment;
	
	Person(String name)
	{
		this.name = name;
		strength = 1;
		endurance  =1;
		inteligence =1;
		dexterity =1;
		agility = 1;
		personality  = 1;
		faith = 1;
		alive = true;
		equipment = new LinkedList<Item>();
		restore_full();
		
		
	}
	
	void restore_full()
	{
		health = 10 *endurance;
		force = 7 * inteligence + (7 *faith);
		stamina = (5 * endurance) + (3* strength) + (2*dexterity) + (2*agility);
		
	}
	
	void change_hfs(int h,int f,int s)
	{
		health+=h;
		stamina+=s;
		force+=f;
		
		if(health <0)
		{
			alive = false;
			System.out.println(name + " is not alive anymore!");
		}
		if (health>10* endurance)
		{
			health = 10 *endurance;
		}
		if (force> 7 * inteligence + (7 *faith))
		{
			force = 7 * inteligence + (7 *faith);
		}
		if (stamina > (5 * endurance) + (3* strength) + (2*dexterity) + (2*agility))
		{
			stamina = (5 * endurance) + (3* strength) + (2*dexterity) + (2*agility);
		}
	}
	
	
	
}
