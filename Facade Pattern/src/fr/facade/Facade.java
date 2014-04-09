package fr.facade;

import fr.objects.Lamp;
import fr.objects.Sensor;

public class Facade {

	private Lamp lamp = new Lamp();
	private Sensor sensor = new Sensor();
	
	public Facade(){
		System.out.println("facade init");
	}
	
	public void activate(){
		lamp.activate();
		sensor.activate();
	}
	
	public void deastivate(){
		lamp.desactivate();
		sensor.desactivate();
	}
	
	
}
