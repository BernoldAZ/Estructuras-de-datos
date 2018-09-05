package game;

import java.io.FileNotFoundException;

import elementosJuego.Ingrediente;
import reader.Lector;
import structures.LinkedDoubleList;

public class gelato {

	public static void main(String[] args) throws FileNotFoundException {
		
		Lector tester = new Lector();
		Ingrediente ingrediente1 = (Ingrediente) tester.readJSON("archivo.json");
		Ingrediente ingrediente2 = (Ingrediente) tester.readJSON("archivo2.json");
		
		LinkedDoubleList <Ingrediente> listaIngredientes = new LinkedDoubleList<Ingrediente>();
		listaIngredientes.add(ingrediente1);
		listaIngredientes.add(ingrediente2);
		

	}

}
