package Model;

import java.util.Comparator;

public class PerroEdadCompare implements Comparator<Perro> {

	public PerroEdadCompare() {
	}

	@Override
	public int compare(Perro o1, Perro o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
