package reader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GlobalReader {
	public static String readFile (String address) throws FileNotFoundException, IOException {
		String finalString = "";
		String cadena;
		FileReader file = new FileReader(address);
		BufferedReader buffer = new BufferedReader(file);
		while((cadena = buffer.readLine())!=null) {
			finalString = finalString + " " + cadena;
			}
		buffer.close();
		return finalString;
	}
}


