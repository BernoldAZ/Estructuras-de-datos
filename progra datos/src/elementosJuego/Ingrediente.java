package elementosJuego;

import structures.LinkedDoubleList;

public class Ingrediente {
	private String nombre;
	private int identificador;
	private String color;
	private boolean topping;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isTopping() {
		return topping;
	}
	public void setTopping(boolean topping) {
		this.topping = topping;
	}
	
	
}
