package hsin.jbdc_demo;

import java.util.Arrays;

import project_kassenbon.model.sortiment.Produkt;

public class App {

	public static void main(String[] args) {
//		Database database = new Database("mariadb", "127.0.0.1:3306", "hr", "root", null);
//		System.out.println(Arrays.toString(database.getEmployees()));
//		database.insertEmployee(new Employee(51, "Max", "Mustermann", 12345.5));
		
		Database database = new Database("mariadb", "127.0.0.1:3306", "kassenbon_projekt", "root", null);
		database.insertProdukt(new Produkt("Cola 1l", 1.5, 1));
		System.out.println(Arrays.toString(database.getProdukte()));
		
	}

}
