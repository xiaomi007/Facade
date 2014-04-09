package fr.client;

import fr.facade.Facade;

public class Main {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.activate();
		facade.deastivate();

	}

}
