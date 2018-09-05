package elementosJuego;

import structures.Stack;
import structures.iStackable;

public class Cono<T>{
	private int numValidacion;
	iStackable cono = new Stack<Ingrediente>();
	
	public int getNumValidacion() {
		return numValidacion;
	}

	public void addBolita (Ingrediente pIngrediente) {
		cono.push(pIngrediente);
		numValidacion = numValidacion + pIngrediente.getIdentificador();
	}
	
	public void removeBolita () {
		Ingrediente pIngrediente = cono.pop();
		numValidacion = numValidacion - pIngrediente.getIdentificador();

	}

}
