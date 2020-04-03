package Model;

import java.util.Collections;
import java.util.LinkedList;
import processing.core.PApplet;
import Model.Perro;

public class Logica extends PApplet {

	String[] txtUno, txtDos;

	private LinkedList<Perro> listaPerro;
	private PApplet app;
	private PerroEdadCompare perroEdadCompare;
	private PerroNombreCompare perroNombreCompare;
	private PerroRazaCompare perroRazaCompare;
	private PerroFechaNacimientoCompare perroFechaNacimientoCompare;

	public Logica(PApplet app) {

		perroEdadCompare = new PerroEdadCompare();
		perroNombreCompare = new PerroNombreCompare();
		perroRazaCompare = new PerroRazaCompare();
		perroFechaNacimientoCompare = new PerroFechaNacimientoCompare();

		this.app = app;
		listaPerro = new LinkedList<Perro>();

		txtUno = app.loadStrings("../data/imports/Uno.txt");
		txtDos = app.loadStrings("../data/imports/Dos.txt");
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

		case 'i':
			Collections.sort(listaPerro);
			break;

		case 'n':
			Collections.sort(listaPerro, perroNombreCompare);
			break;

		case 'e':
			Collections.sort(listaPerro, perroEdadCompare);
			break;

		case 'r':
			Collections.sort(listaPerro, perroRazaCompare);
			break;

		case 'f':
			Collections.sort(listaPerro, perroFechaNacimientoCompare);
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
