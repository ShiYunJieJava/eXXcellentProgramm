package de.exxcellent.challenge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.csvreader.CsvReader;

import de.exxcellent.challenge.pojo.BasicObject;
import de.exxcellent.challenge.pojo.Football;
import de.exxcellent.challenge.pojo.Weather;
import de.exxcellent.challenge.service.ValueCompareObject;
import de.exxcellent.challenge.utils.PropertiesUtil;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    public static void main(String... args) {

        // Your preparation code …
    	int i = 0;
    	List<BasicObject> weatherList = new ArrayList<>();
    	List<BasicObject> footballList = new ArrayList<>();
    	
    	// get FilePath from File csvFilePath.properties
    	PropertiesUtil proUtil = new PropertiesUtil();
    	String weatherFilePath = proUtil.getValue("weatherFilePath");
    	String footballFilePath = proUtil.getValue("footballFilePath");
    	
    	// get Fileformat from FilePath
    	// Hier should create a Interface FileFormatReader and Classes CSVReader, JsonReader and XmlReader.
    	/**
    	String weatherFileFormat = weatherFilePath.substring(weatherFilePath.lastIndexOf(".")+1);
    	if(weatherFileFormat.equals("csv")){
    		FileFormatReader reader = new CsvReader(weatherFilePath);
    	}else if(weatherFileFormat.equals("json")){
    		FileFormatReader reader = new JsonReader(weatherFilePath);
    	}else if(weatherFileFormat.equals("xml")){
    		FileFormatReader reader = new XmlReader(weatherFilePath);
    	}else{
    	}
    	**/
    	  
    	//read File with CsvReader to List<POJO>
    	try {
            CsvReader csvReader = new CsvReader(weatherFilePath);
            csvReader.readHeaders();
            while (csvReader.readRecord()){
            	Weather weather = new Weather(i++, csvReader.get("Day"), Integer.valueOf(csvReader.get("MxT")), Integer.valueOf(csvReader.get("MnT")));
                weatherList.add(weather);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    	try {
            CsvReader csvReader = new CsvReader(footballFilePath);
            csvReader.readHeaders();
            while (csvReader.readRecord()){
            	Football football = new Football(i++, csvReader.get("Team"), Integer.valueOf(csvReader.get("Goals")), Integer.valueOf(csvReader.get("Goals Allowed")));
            	footballList.add(football);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    	//get Results
    	ValueCompareObject obj = new ValueCompareObject();
    	Weather weatherResult = (Weather) obj.getSmallestDiff(weatherList);
    	Football football = (Football) obj.getSmallestDiff(footballList);
    	
    	
        String dayWithSmallestTempSpread = weatherResult.getDay();     // Your day analysis function call …
        String teamWithSmallesGoalSpread = football.getName(); // Your goal analysis function call …

        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallesGoalSpread);
    }
}
