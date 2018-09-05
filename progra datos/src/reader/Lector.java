package reader;

import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.FileWriter; 
import java.io.IOException;  

import com.google.gson.Gson; 
import com.google.gson.GsonBuilder;

import elementosJuego.Ingrediente; 

public class Lector{
	
	private void writeJSON(Object pObject) throws IOException { 
	      GsonBuilder builder = new GsonBuilder(); 
	      Gson gson = builder.create(); 
	      FileWriter writer = new FileWriter("archivo.json");   
	      writer.write(gson.toJson(pObject));   
	      writer.close(); 
	   }  
	   public Object readJSON(String nombre) throws FileNotFoundException { 
	      GsonBuilder builder = new GsonBuilder(); 
	      Gson gson = builder.create(); 
	      BufferedReader bufferedReader = new BufferedReader(
	         new FileReader(nombre));   
	      
	      Ingrediente ingrediente1 = gson.fromJson(bufferedReader, Ingrediente.class); 
	      return ingrediente1; 
	   } 
	   
	   //Asi se hace la instancia que se toma del json
	   //Lector tester = new Lector();
	   // Ingrediente ingrediente1 = (Ingrediente) tester.readJSON("archivo.json"); 
	   // 

}
