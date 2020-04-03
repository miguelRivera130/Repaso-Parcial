package Model;

import java.util.Comparator;

public class PerroFechaNacimientoCompare implements Comparator<Perro> {

	public PerroFechaNacimientoCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Perro o1, Perro o2) {
		return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
	}

}
