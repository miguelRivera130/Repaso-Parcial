package Model;

import processing.core.PApplet;

public class Perro implements Comparable<Perro>{

	private int posX, posY;
	private int id, edad;
	private String nombre, raza, fechaNacimiento;
	private PApplet app;

	public Perro(int posX, int posY, int id, String nombre, int edad, String raza, String fechaNacimiento,
			PApplet app) {

		this.posX = posX;
		this.posY = posY;

		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
		this.fechaNacimiento = fechaNacimiento;

		this.app = app;
	}

	public void pintar() {
		app.text(this.id + this.nombre + this.edad + this.raza + this.fechaNacimiento, this.posX, this.posY);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public int compareTo(Perro proxPerro) {
	return this.id - proxPerro.getId();
	}

}
