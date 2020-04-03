package Model;

import java.util.Comparator;

public class PerroNombreCompare implements Comparator<Perro> {

	public PerroNombreCompare() {
	}

	@Override
	public int compare(Perro o1, Perro o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
