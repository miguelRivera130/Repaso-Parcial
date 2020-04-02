package Controller;

import Model.Logica;
import processing.core.PApplet;

public class ControllerMain {

	private Logica logica;

	public ControllerMain(PApplet app) {

		logica = new Logica(app);

	}
	
	public void sortList(char list) {
		logica.sortList(list);
		
	}

}