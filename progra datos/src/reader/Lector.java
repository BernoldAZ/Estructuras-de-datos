package reader;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.*;

public class Lector extends GlobalReader{

    public static void main(String[] args) throws FileNotFoundException, IOException{
 	
        String json1 = "[{\"dorsal\":6," + "\"name\":\"Iniesta\","
                + "\"demarcation\":[\"Right winger\",\"Midfielder\"],"
                + "\"team\":\"FC Barcelona\"}]";

        String s = "C:\\Users\\usuario\\Documents\\GitHub\\Estructuras-de-datos\\progra datos\\Prueba.txt";
        
        String json2 = readFile(s);
        
        JsonParser parser = new JsonParser();

        // Obtain Array
        JsonArray gsonArr = parser.parse(json1).getAsJsonArray();

        // for each element of array
        for (JsonElement obj : gsonArr) {

            // Object of array
            JsonObject gsonObj = obj.getAsJsonObject();

            // Primitives elements of object
            int dorsal = gsonObj.get("dorsal").getAsInt();
            String name = gsonObj.get("name").getAsString();
            String team = gsonObj.get("team").getAsString();

            // List of primitive elements
            JsonArray demarcation = gsonObj.get("demarcation").getAsJsonArray();
            List listDemarcation = new ArrayList();
            for (JsonElement demarc : demarcation) {
                listDemarcation.add(demarc.getAsString());
            }

            // Object Constructor
            FootballPlayer iniesta = new FootballPlayer(dorsal, name,listDemarcation, team);
            System.out.println(iniesta.team);
        }
    }
}
