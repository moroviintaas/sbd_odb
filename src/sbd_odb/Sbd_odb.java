package sbd_odb;

import java.io.File;
import java.io.IOException;


public class Sbd_odb {

	public static void main(String[] args) {
		
		//na początek czyścimy bazę danych
		try {
			File f = new File("database");
			f.delete();
			
		    
		}
		catch(NullPointerException e)
		{
			System.out.println("Wyjątek: " + e);
			
		}
		catch (SecurityException e )
		{
			System.out.println("Wyjątek bezpieczeństwa: " + e);
		}
		
		//tworzymy obiekty do bazy
		
		Weapon wp1 = new Weapon(0x10000001,"Przeklęta drewniana szabla",6,20,70);
		Weapon wp2 = new Weapon(0x10000002,"Miecz zabójcy demonów skąpany w porannej tęczy (no homo)",7,40,70);
		
		Armour arm1 = new Armour(0x20000001, "Pancerz rycerski", 5, 30,50);
		Armour arm2 = new Armour(0x20000002, "Bechatka", 10, 5,10);
		
			
		Potion po1 = new Potion(0x30000001, "Bimber Fichała", 1 , 20, 700, -20, 60, 20, 0);
		Potion po2 = new Potion(0x30000002, "Misktura zdrowia", 1 , 10, 700, 10, 0, 0, 10);
		
		Grenade gr1 = new Grenade(0x40000001, "Sekret Mnicha", 1, 12, 12, 20, 0, 20);
		
		
		Person p1 = new Person("Lord Rafael de Bogl");
		Person p2 = new Person("przerażający Arcylich Robert");
		
		p1.add_item(wp2);
		p1.add_item(arm1);
		p1.add_item(po2);
		
		p2.add_item(wp1);
		p2.add_item(arm2);
		p2.add_item(po1);
		p2.add_item(gr1);

		System.out.print(p1.show_equipment()+ "\n\n");
		
		System.out.print(p2.show_equipment()+ "\n\n");
		
		//otwieramy bazę:
		
		
		

	}

}
