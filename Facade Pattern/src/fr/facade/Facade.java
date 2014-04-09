package fr.facade;

import fr.objects.Lamp;
import fr.objects.Sensor;

/**
The facade regroup all the objects it needs to control (here the lamp and the sensor) by intentiate them.
We also define the method that the client will be able to use.
**/
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
