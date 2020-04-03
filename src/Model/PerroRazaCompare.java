package Model;

import java.util.Comparator;

public class PerroRazaCompare implements Comparator<Perro> {

	public PerroRazaCompare() {
	}

	@Override
	public int compare(Perro o1, Perro o2) {
		return o1.getRaza().compareTo(o2.getRaza());
	}

}
