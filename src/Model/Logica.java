package Model;

import java.util.Collections;
import java.util.LinkedList;
import processing.core.PApplet;
import Model.Perro;

public class Logica extends PApplet {

	String[] txtUno, txtDos;

	private LinkedList<Perro> listaPerro;
	private PApplet app;

	public Logica(PApplet app) {

		this.app = app;
		listaPerro = new LinkedList<Perro>();

		txtUno = app.loadStrings("Uno.txt");
		txtDos = app.loadStrings("Dos.txt");
	}

	public void listaPerros() {
		for (int i = 0; i < txtDos.length; i++) {
			String[] listaDos = txtDos[i].split(",");
			for (int j = 0; j < this.txtUno.length; i++) {
				String[] listaUno = txtUno[j].split(",");
				int id = Integer.parseInt(listaUno[0]);
				int edad = Integer.parseInt(listaUno[2]);

				if (listaDos[0].trim().equals(listaUno[0].trim())) {

					listaPerro.add(new Perro(50, 100 + 20 * j, id, listaUno[0], edad, listaDos[1], listaDos[2], app));

				}
			}
		}
	}

	public void sortList(char list) {
		switch (list) {
		
		case 'i' :
			Collections.sort(listaPerro);
			break;

		}
	}

	public LinkedList<Perro> getListaPerro() {
		return listaPerro;
	}

	public void setListaPerro(LinkedList<Perro> listaPerro) {
		this.listaPerro = listaPerro;
	}

}
