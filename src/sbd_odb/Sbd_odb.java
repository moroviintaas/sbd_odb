package sbd_odb;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;


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
		
		List <Person> gracze;
		
		

		System.out.print(p1.show_equipment()+ "\n\n");
		
		System.out.print(p2.show_equipment()+ "\n\n");
		
		//Baza:
		
		//wersja 7.2, 
		//otwieramy bazę:
		ObjectContainer db=Db4o.openFile("database");
		try {
			System.out.println("\nZapisujemy obie postaci w bazie:");
			System.out.println("\tdb.store(p1);\n\tdb.store(p2);\n");
			
			db.store(p1);
			db.store(p2);
			
			System.out.println("Zapytanie o graczy z imieniem zawierającym \"Robert\"");
			System.out.println("Wypisany ekwipunek");
			
			gracze = db.query(new Predicate<Person>() {
				public boolean match(Person gracz) {
				return gracz.name.contains("Robert");
				}
				});
			System.out.println("znaleziono obiektów : "  + + gracze.size());
			System.out.println(gracze.get(0).show_equipment());
			
			System.out.println("\nZmieniamy obiekt Bimber Fichała poza bazą:");
			System.out.println("\tpo1.name = \"Bimber Fichała z Borcuchów\";\n");
			System.out.println("\nZapisujemy w bazie:");
			System.out.println("\tdb.store(po1);\n");
			
			po1.name = "Bimber Fichała z Borcuchów";
			db.store(po1);;
			
			System.out.println("\nPonownie pobieramy dane z bazy i wypisujemy ekwipunek:");
			System.out.println("Widać, że obiekt został zaktualizowany w bazie danych.\n");
			
			gracze = db.query(new Predicate<Person>() {
				public boolean match(Person gracz) {
				return gracz.name.contains("Robert");
				}
				});
			System.out.println("znaleziono obiektów : "  + gracze.size());
			System.out.println(gracze.get(0).show_equipment());
			
			
		}
		finally {
		db.close();
		}
		
		
		
		
		
		
		

	}

}
